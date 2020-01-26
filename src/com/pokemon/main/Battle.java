package com.pokemon.main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;


public class Battle {

private Pokemon pokemon = new Caterpie();	
private Pikachu pikachu = new Pikachu("Pikachu",null,100,100,5);
private Moves moves = new Moves();
private String moveName;	
Graphics g;
private ImageIcon ii;
private int x=954;
private int x2=0;
private int x3=0;
private int x4=954;
private int x5=0;
private int x6=954;

private int y=466;
private int y2=466;
private int x7=954;
private int x8=-150;
private int x9=-305;
private int x10=954;
private int x11=300;
private int y11=500;
private int pos=1;
private boolean move1=false;
private boolean screen=false;
private boolean battleScreen=false;
private boolean attack =false;
private boolean pokemonAttack=false;

private boolean arrow=false;
private int arrow2=1;

private boolean started = false;
private boolean started2 = false;


	public Battle()
	{
	
	
	}
	
	public void start(Graphics g)
	{
		
		
		if(started == true&&started2==false)
		{
	
	g.fillRect(x, 0, 100000, 186);
	g.fillRect(0, 746, x2, 186);
	
	g.fillRect(0, 186, x3, 186);
	g.fillRect(x4, 560, 100000, 186);
	
	g.fillRect(0, 372, x5, 190);
	
		if(x5>=954)
		started2=true;
		}		
		if(started2==true)
		{
		
			
			ii = new ImageIcon(this.getClass().getResource("Background.jpg"));
			Image img = ii.getImage();
			Graphics2D g2d = (Graphics2D) g;
			 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			 RenderingHints.VALUE_ANTIALIAS_ON);
			 Font font = new Font("Serif", Font.PLAIN, 40);
			  g2d.setFont(font);
			        
	        g2d.drawImage(img, 0, 0, null);
			
			g.fillRect(0, 0, 10000, y);
			g.fillRect(0, y2, 10000, 10000);
		
			g.setColor(new Color(41,163,163));
			g.fillRect(0, 746, 1000, 1000);
			g.setColor(new Color(230,92,0));
			g.fillRect(0, 741, 1000, 5);
			g.setColor(Color.BLACK);
			g.fillRect(0, 725, 1000, 16);
		
		
			g.drawImage(pokemon.getImage(), x8, 150, null);
			
			g.setColor(new Color(255,255,204));
			g.fillRect(x9, 100, 300, 100);
			g.setColor(Color.BLACK);
			
			g.fillRect(x9-5, 95, 310, 5);
			g.fillRect(x9-5, 95, 5, 110);
			g.fillRect(x9+300, 95, 5, 110);
			g.fillRect(x9-5, 200, 310, 5);
			g.fillRect(x9+50, 170, 35, 15);
			g2d.drawString(pokemon.getName(), x9+5, 150);
			g2d.setFont(new Font("default", Font.BOLD, 16));
			g2d.setColor(Color.RED);
			 g2d.drawString("HP", x9+55, 182);
			 g2d.setFont(font);
			  g.setColor(Color.GREEN);
			  int h=(int)(150*((double)pokemon.getHealth()/pokemon.gettrueHealth()));
			  g.fillRect(x9+85, 170, h, 15);

			  g.setColor(Color.BLACK);
			  
			  if(pokemon.getBurn()==true)
			  {
				  ii = new ImageIcon(this.getClass().getResource("burn.png"));
				  img = ii.getImage();
				  g.drawImage(img, 28, 169, null);
				  
			  }
			  if(pokemon.getPoison()==true)
			  {
				  ii = new ImageIcon(this.getClass().getResource("poison.png"));
				  img = ii.getImage();
				  g.drawImage(img, 28, 169, null);
				  
			  }
			  if(pokemon.getParalysis()==true)
			  {
				  ii = new ImageIcon(this.getClass().getResource("paralysis.png"));
				  img = ii.getImage();
				  g.drawImage(img, 28, 169, null);
				  
			  }
		
			if(move1==true)
			{
			g.setColor(new Color(255,255,204));
			g.fillRect(x10, 550, 300, 100);
			g.setColor(Color.BLACK);
			
			g.fillRect(x10-5, 545, 310, 5);
			g.fillRect(x10-5, 545, 5, 110);
			g.fillRect(x10+300, 545, 5, 110);
			g.fillRect(x10-5, 650, 310, 5);
			g.fillRect(x10+50, 620, 35, 15);
		
			g2d.drawString("Pikachu", x10+5, 600);
			g2d.setFont(new Font("default", Font.BOLD, 16));
			g2d.setColor(Color.RED);
			g2d.drawString("HP", x10+55, 634);
			 g2d.setFont(font);
			  g.setColor(Color.GREEN);
			  int h1=(int)(150*((double)pikachu.getHealth()/pikachu.gettrueHealth()));
			  g.fillRect(x10+85, 620, h1, 15);
			  g.setColor(Color.BLACK);
			 
			  if(pikachu.burn==true)
			  {
				  ii = new ImageIcon(this.getClass().getResource("burn.png"));
				  img = ii.getImage();
				  g.drawImage(img, 640, 620, null);
				  
			  }
			  if(pikachu.poison==true)
			  {
				  ii = new ImageIcon(this.getClass().getResource("poison.png"));
				  img = ii.getImage();
				  g.drawImage(img, 640, 620, null);
				  
			  }
			  if(pikachu.paralysis==true)
			  {
				  ii = new ImageIcon(this.getClass().getResource("paralysis.png"));
				  img = ii.getImage();
				  g.drawImage(img, 640, 620, null);
				  
			  }
			

			
//draw Text
			  
			
			if(screen==false&&move1==false&&attack==false&&battleScreen==false&&pokemonAttack==false)
		    g2d.drawString("Wild Pokemon Appeared!",0,850);
			
		    if(move1==true&&screen==false&&attack==false&&battleScreen==false&&pokemonAttack==false)
			g2d.drawString("Go Pikachu!",0,850);
			
			if(screen==true)
			{
				g.setColor(Color.WHITE);
			g.fillRect(500, 741, 1000, 1000);
			g.setColor(new Color(102,102,255));
			g.fillRect(485, 726, 15, 1000);
			g.fillRect(485, 726, 1000, 15);
			g.setColor(Color.BLACK);
			g2d.drawString("What will your Pokemon do?",0,850);
			g2d.drawString("Fight",600,850);
			g2d.drawString("Run",800,850);
			
		
			if(arrow==false)
			{
			int[]x={565,590,565};
			int[]y={820,835,850};
			g.fillPolygon(x,y,3);
			}
			if(arrow==true)
			{
			int[]x={765,790,765};
			int[]y={820,835,850};
			g.fillPolygon(x,y,3);
			}
			}
			
			if(battleScreen==true)
			{
		/*	Moves moves= new Moves();
			String s="Thunder";
		
			java.lang.reflect.Method method;
			try {
				  method = moves.getClass().getMethod(s);
				} catch (SecurityException e) { }
				  catch (NoSuchMethodException e) { }
		*/
			
			
			g.setColor(Color.BLACK);
			g.setColor(Color.WHITE);
			g.fillRect(600, 741, 1000, 1000);
			g.setColor(new Color(102,102,255));
			g.fillRect(585, 726, 15, 1000);
			g.fillRect(585, 726, 1000, 15);
			
			g.setColor(Color.WHITE);
			g.fillRect(15, 741, 545, 1000);
			g.setColor(new Color(102,102,255));
			g.fillRect(0, 726, 15, 1000);
			g.fillRect(0, 726, 560, 15);
			g.fillRect(545, 726, 15, 1000);
			g.setColor(Color.BLACK);
			g.fillRect(560, 726, 25,1000);
			
			g2d.drawString("Thunder", 100, 825);
			g2d.drawString("Quick Attack", 300, 825);
			g2d.drawString("Spark", 100, 875);
			g2d.drawString("Slam", 300, 875);
			
			if(arrow2==1)
			{
			int[]x={65,90,65};
			int[]y={795,815,825};
			g.fillPolygon(x,y,3);
			}
			if(arrow2==2)
			{
			int[]x={265,290,265};
			int[]y={795,815,825};
			g.fillPolygon(x,y,3);
			}
			if(arrow2==3)
			{
			int[]x={65,90,65};
			int[]y={845,865,875};
			g.fillPolygon(x,y,3);
			}
			if(arrow2==4)
			{
			int[]x={265,290,265};
			int[]y={845,865,875};
			g.fillPolygon(x,y,3);
			}
			}
			
			if(attack==true)
			g2d.drawString("Pikachu used "+moveName+"!", 0, 825);
			
			if(pokemonAttack==true){
			g2d.drawString(pokemon.getName()+" used tackle!", 0, 825);
			}
	
			if(pokemon.getHealth()<=0)
			{
				g.fillRect(0, 0, 10000, y);
				g.fillRect(0, y2, 10000, 10000);
			
				g.setColor(new Color(41,163,163));
				g.fillRect(0, 746, 1000, 1000);
				g.setColor(new Color(230,92,0));
				g.fillRect(0, 741, 1000, 5);
				g.setColor(Color.BLACK);
				g.fillRect(0, 725, 1000, 16);
				g2d.drawString(pokemon.getName()+" feinted", 0, 825);
			
			}
			if(pikachu.getHealth()<=0)
			{
				g.fillRect(0, 0, 10000, y);
				g.fillRect(0, y2, 10000, 10000);
			
				g.setColor(new Color(41,163,163));
				g.fillRect(0, 746, 1000, 1000);
				g.setColor(new Color(230,92,0));
				g.fillRect(0, 741, 1000, 5);
				g.setColor(Color.BLACK);
				g.fillRect(0, 725, 1000, 16);
				g2d.drawString("pikachu feinted", 0, 825);
			
			}
			//seperate into single statements
			}
			
			
			
			
			
			
//======================================================================================================================================
			

				
			if(pos==1){
			ii = new ImageIcon(this.getClass().getResource("Picture1.png"));
		 img = ii.getImage();
			g.drawImage(img, x7, 500, null);
			}
				
			if(pos==2){
			ii = new ImageIcon(this.getClass().getResource("Picture2.png"));
			 img = ii.getImage();
			g.drawImage(img, x7, 500, null);
			}
						
			if(pos==3){
			ii = new ImageIcon(this.getClass().getResource("Picture3.png"));
		    img = ii.getImage();
			g.drawImage(img, x7, 500, null);
			}
								
		
			if(pos==4){
			ii = new ImageIcon(this.getClass().getResource("Picture4.png"));
			img = ii.getImage();
			g.drawImage(img, x7, 500, null);
			}
			if(pos==5&&x11==324){
			  ii = new ImageIcon(this.getClass().getResource("Picture6.png"));
			  img = ii.getImage();
			  g.drawImage(img, x11, y11, null);
				}
			else if(pos==5)
			{
				 ii = new ImageIcon(this.getClass().getResource("Picture5.png"));
				  img = ii.getImage();
				  g.drawImage(img, x11, y11, null);
				}
			}
		/*if (pos==6)
		 * draw pokemon
		 */
		
			
		}

	
	

	
	public void tick()
	{
		if(started ==true)
		{
		x-=20;
		x2+=20;
		if(x<=0)
			{
				x3+=20;
				x4-=20;
				
					if(x4<=0)
					{
						x5+=20;
			
					}
			}
		}
		if(started2==true)
		{
			y-=15;
			y2+=15;
			
			if(y<=0&&x7>=100)
			{
				x7-=10;	
				x8+=10;
				
			}
			if(x7<=100&&x9<=0)
				x9+=25;	
		if(move1==true&&x10>=640)
		{
			
			x10-=25;
		}
		if(move1==true)
		{
			x7-=10;
			if(x11==300&&y11>=450)
			{
				y11-=5;
			}
			else if(y11<=500)
			{
				x11+=2;
				y11+=5;
			}
		}
			
	
		}
	}
	
	
	public void setStarted(boolean a)

	{
		started = a;
	}
	public void reset()
	{
		x=954;
		 x2=0;
		 x3=0;
		 x4=954;
		 x5=0;
		 x6=954;

	 y=466;
		 y2=466;
		 x7=954;
		 x8=-150;
		 x9=-300;
		 x10=954;
		 pos=1;
		 move1=false;
		screen=false;

		 arrow=false;
		 arrow2=1;

		 started = false;
		 started2 = false;
		 attack=false;
		 pokemonAttack=false;
		 
		 pokemon = new Caterpie();	
	

		  pikachu = new Pikachu("Pikachu",null,100,100,5);

	}
	
	
	public int getXnine()
	{
		return x9;
	}
	public void spriteChange()
	{
		try {
		    Thread.sleep(150);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		pos=2;
		try {
		    Thread.sleep(150);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		pos=3;
		try {
		    Thread.sleep(150);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		pos=4;
		try {
		    Thread.sleep(150);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		pos=5;
	/*	try {
		    Thread.sleep(150);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		pos=6;*/
	}
	public void setMove1(boolean a)
	{
		move1=a;
	}
	public void setscreen(boolean a)
	{
		screen=a;
	}
	public void setArrow(Boolean x)
	{
		arrow=x;
	}
	public boolean getMove1()
	{
		return move1;
	}
	public boolean getscreen()
	{
		return screen;
	}
	public boolean getArrow()
	{
		return arrow;
	}
public boolean getbattleScreen()
	{
		return battleScreen;
	}
public void setbattleScreen(Boolean x)
	{
		battleScreen=x;
	}
public int getArrow2()
	{
		return arrow2;
	}
public void setArrow2(int x)

	{
		arrow2=x;
	}
public void selectPokemon(Pokemon pokemon)
	{
		this.pokemon = pokemon;
	}
public Pokemon getPokemon()
	{
		return pokemon;
	}
public void setmoveName(String s)
{
	moveName=s;
}
public void setAttack(Boolean s)
{
	attack=s;
}
public boolean getAttack()
{
	return attack;
}
public void setpokemonAttack(Boolean s)
{
	pokemonAttack=s;
}
public boolean getpokemonAttack()
{
	return pokemonAttack;
}
public Pikachu getPikachu()
{
	return pikachu;
}
public Moves getMoves()
{
	return moves;
}
}