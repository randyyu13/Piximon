package com.pokemon.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private long timeNow;
	private GameObject player;
	private MapArray map;
	private boolean moved = false;
	private Battle battle;
	public Pokemon pokemon;
	private Pikachu pikachu;
	
	
	private boolean started = false;
	
	
	public KeyInput(Handler handler,GameObject player,MapArray map,Battle battle)
	{
		this.handler = handler;
		this.player=player;
		this.map=map;
		this.battle = battle;
		this.pokemon = battle.getPokemon();
		this.pikachu=battle.getPikachu();
		
	}
	
	public void keyPressed(KeyEvent e)
	{

		int key = e.getKeyCode();

		if(started==false)
		{
		for(int i=0;i<handler.object.size();i++)
		{	
		
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId()==ID.Player && System.currentTimeMillis()>timeNow+410)
			{
			
			
				if(key==KeyEvent.VK_DOWN)
				{
					timeNow = System.currentTimeMillis();
					
					System.out.println(((Player)player).getLocX());
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()+1).canWalk()==true)
					{
					moved = true;
					tempObject.setY(tempObject.getY()+10);
					((Player)tempObject).setPos(12);
					}
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()+1).canWalk()==true)
					tempObject.setY(tempObject.getY()+10);
					((Player)tempObject).setPos(11);
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()+1).canWalk()==true)
					tempObject.setY(tempObject.getY()+10);
					((Player)tempObject).setPos(13);
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()+1).canWalk()==true)
					tempObject.setY(tempObject.getY()+10);
					((Player)tempObject).setPos(11);
					if(moved == true)
						((Player)player).setLocY(((Player)player).getLocY()+1);
						moved = false;
					if(map.getTile(((Player)player).getLocX(),((Player)player).getLocY()).getType().equals("Grass"))
					{	
					
						started = true;
						battle.setStarted(started);
					
					}
				
			
				
			
				}
				
				
					else if(key==KeyEvent.VK_LEFT )
				{
					timeNow = System.currentTimeMillis();
					
					
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX()-1, ((Player)player).getLocY()).canWalk()==true)
					{
					moved = true;
					tempObject.setX(tempObject.getX()-10);
					((Player)tempObject).setPos(22);
					}
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX()-1, ((Player)player).getLocY()).canWalk()==true)
					tempObject.setX(tempObject.getX()-10);
					((Player)tempObject).setPos(21);
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX()-1, ((Player)player).getLocY()).canWalk()==true)
					tempObject.setX(tempObject.getX()-10);
					((Player)tempObject).setPos(23);
					try {
					    Thread.sleep(100);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					if(map.getTile(((Player)player).getLocX()-1, ((Player)player).getLocY()).canWalk()==true)
					tempObject.setX(tempObject.getX()-10);
					((Player)tempObject).setPos(21);
					if(moved == true)
						((Player)player).setLocX(((Player)player).getLocX()-1);
						moved = false;
						if(map.getTile(((Player)player).getLocX(),((Player)player).getLocY()).getType().equals("Grass"))
						{	
							started = true;
							battle.setStarted(started);
					
						}
					
					
			
					
				}
					else if(key==KeyEvent.VK_RIGHT )
					{
						
						timeNow = System.currentTimeMillis();
					System.out.println(((Player)player).getLocX());
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX()+1, ((Player)player).getLocY()).canWalk()==true)
						{
						moved =true;
						tempObject.setX(tempObject.getX()+10);
						((Player)tempObject).setPos(32);
						}
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX()+1, ((Player)player).getLocY()).canWalk()==true)
						tempObject.setX(tempObject.getX()+10);
						((Player)tempObject).setPos(31);
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX()+1, ((Player)player).getLocY()).canWalk()==true)
						tempObject.setX(tempObject.getX()+10);
						((Player)tempObject).setPos(33);
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX()+1, ((Player)player).getLocY()).canWalk()==true)
						tempObject.setX(tempObject.getX()+10);
						((Player)tempObject).setPos(31);
						if(moved == true)
							((Player)player).setLocX(((Player)player).getLocX()+1);
							moved = false;
							if(map.getTile(((Player)player).getLocX(),((Player)player).getLocY()).getType().equals("Grass"))
							{	
								started = true;
								battle.setStarted(started);
								
							}
						
						
					}
					
				
					else if(key==KeyEvent.VK_UP )
				{
						timeNow = System.currentTimeMillis();
					
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()-1).canWalk()==true)
				
						{
						moved=true;
						tempObject.setY(tempObject.getY()-10);
						((Player)tempObject).setPos(42);
						}
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()-1).canWalk()==true)
						tempObject.setY(tempObject.getY()-10);
						((Player)tempObject).setPos(41);
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()-1).canWalk()==true)
						tempObject.setY(tempObject.getY()-10);
						((Player)tempObject).setPos(43);
						try {
						    Thread.sleep(100);
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						if(map.getTile(((Player)player).getLocX(), ((Player)player).getLocY()-1).canWalk()==true)
						tempObject.setY(tempObject.getY()-10);
						((Player)tempObject).setPos(41);
						if(moved == true)
							((Player)player).setLocY(((Player)player).getLocY()-1);
							moved = false;
							if(map.getTile(((Player)player).getLocX(),((Player)player).getLocY()).getType().equals("Grass"))
							{
								
								started = true;
								battle.setStarted(started);
							
							}
						
						
				}
				if(key==KeyEvent.VK_ENTER)
				{
					if(((Player)player).getLocX()==10&&((Player)player).getLocY()==9&&((Player)player).getPos()==41)
					{
						System.out.println("Hi!");
					}
				}
				
			}
		}
		}
		
		else 
		{
			
			if(pokemon.getHealth()<=0&&key==KeyEvent.VK_ENTER)
			{
				 started=false;
				 battle.reset();
				 pokemon=battle.getPokemon();

				 pikachu =battle.getPikachu();
					key= 1000;
			}
			if(pikachu.getHealth()<=0&&key==KeyEvent.VK_ENTER)
			{
				 started=false;
				 battle.reset();
				 pokemon=battle.getPokemon();
				 pikachu =battle.getPikachu();
					key= 1000;
			}

			if(battle.getXnine()>=0&&key==KeyEvent.VK_ENTER&&battle.getMove1()==false)
			{
				battle.spriteChange();
				battle.setMove1(true);
				key=100;
				
			}

			
//================================================================================================================================
			
			 if(key==KeyEvent.VK_ENTER&&battle.getscreen()==false&&battle.getAttack()==false&&battle.getpokemonAttack()==false&&battle.getbattleScreen()==false)
			 {
					
					battle.setscreen(true);
					key=100;
			 }

			 if(battle.getscreen()==true&&key==KeyEvent.VK_RIGHT&&battle.getArrow()==false)
			 {
				 battle.setArrow(true);
					key= 1000;
			 }
			 if(battle.getscreen()==true&&key==KeyEvent.VK_LEFT&&battle.getArrow()==true)
			 {
				 
			 
				 battle.setArrow(false);
					key= 1000;
			 }
			 
//================================================================================================================================

		
			 
			 if(battle.getscreen()==true&&battle.getArrow()==true&&key==KeyEvent.VK_ENTER)
			 {
				 started=false;
				 battle.reset();
				 pokemon=battle.getPokemon();

				 pikachu =battle.getPikachu();
					key= 1000;
			 } 
			 
			 if(battle.getArrow()==false&&key==KeyEvent.VK_ENTER&&battle.getscreen()==true)
			 {
				 battle.setbattleScreen(true);
				 battle.setscreen(false);
					key= 1000;
			 }
			 
	
//================================================================================================================================
	
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_RIGHT&&battle.getArrow2()==1)
			 {
				 battle.setArrow2(2);
					key= 1000;}
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_DOWN&&battle.getArrow2()==1)
			 {
				 battle.setArrow2(3);
					key= 1000;}
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_LEFT&&battle.getArrow2()==2)
			 {
				 battle.setArrow2(1);
					key= 1000;}
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_DOWN&&battle.getArrow2()==2)
			 {
				 battle.setArrow2(4);
					key= 1000;}
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_RIGHT&&battle.getArrow2()==3)
			 {
				 battle.setArrow2(4);
					key= 1000;}
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_UP&&battle.getArrow2()==3)
			 {
				 battle.setArrow2(1);	
					key= 1000;}
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_LEFT&&battle.getArrow2()==4)
			 {
				 battle.setArrow2(3);
					key= 1000;}
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_UP&&battle.getArrow2()==4)
			 {
				 battle.setArrow2(2);
					key= 1000;}
			 }
		
//================================================================================================================================		
		
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_ENTER&&battle.getArrow2()==1&&battle.getAttack()==false)
			 {
				 
					battle.setmoveName("Thunder");
				 battle.setAttack(true);
				 battle.setbattleScreen(false);
						pokemon.setHealth(pokemon.getHealth()-10);
		
				key= 1000;
			 }
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_ENTER&&battle.getArrow2()==2&&battle.getAttack()==false)
			 {	battle.setmoveName("Quick Attack");
				 battle.setAttack(true);
				 battle.setbattleScreen(false);
				pokemon.setHealth(pokemon.getHealth()-3);
				key= 1000;
			 }
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_ENTER&&battle.getArrow2()==3&&battle.getAttack()==false)
			 {			battle.setmoveName("Spark");
				 battle.setAttack(true);
				 battle.setbattleScreen(false);
					pokemon.setHealth(pokemon.getHealth()-8);
				key= 1000;
			 }
			 if(battle.getbattleScreen()==true&&key==KeyEvent.VK_ENTER&&battle.getArrow2()==4&&battle.getAttack()==false)
			 {
					battle.setmoveName("Slam");
				 battle.setAttack(true);
				 battle.setbattleScreen(false);
					pokemon.setHealth(pokemon.getHealth()-5);
					System.out.println(pokemon.getHealth());
				
				key= 1000;
			 }
			 
//================================================================================================================================
		
			if(battle.getAttack()==true&&key==KeyEvent.VK_ENTER)
			 {
				 battle.setpokemonAttack(true);
				 battle.setAttack(false);
					pikachu.setHealth(pikachu.getHealth()-5);
					key= 1000;
			 }
			if(battle.getpokemonAttack()==true&&key==KeyEvent.VK_ENTER)
			 {
			
				 battle.setscreen(true);
				 battle.setpokemonAttack(false);
					key= 1000;
			 }
			//only do true statements

	}

	public void keyReleased(KeyEvent e){
		
		int key = e.getKeyCode();
	}
	public void setStarted(boolean a)
	{
		started = a;
	}
	public Pokemon selector()
	{
		return new Caterpie();
	}
}

