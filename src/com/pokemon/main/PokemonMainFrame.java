package com.pokemon.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class PokemonMainFrame extends Canvas implements Runnable{
	
	private static final long serialVersionUID = 8320999467410371392L;
	
	public static final int WIDTH = 960, HEIGHT = 960;
	
	//954,932   : 186
	
	private MapArray map;
	private Thread thread;
	private boolean running = false;
	private Battle battle = new Battle();

	
	private Handler handler;
	
	public PokemonMainFrame()
	{
		handler = new Handler();
		

	for (int x=0;x<=960;x+=30)
		for(int y=0;y<=960;y+=30)
			handler.object.add(new Tile(x, y, ID.Tile));
		map=new MapArray(handler);
		
		
	//Map Add
		map.addTree(0,0);
		map.addTree(0,2);
		map.addTree(0,4);
		map.addTree(0,6);
		map.addTree(0,8);
		map.addTree(0,10);
		map.addTree(0,12);
		map.addTree(0,14);
		map.addTree(0,16);
		map.addTree(0,18);
		map.addTree(0,20);
		map.addTree(0,22);
		
		map.addTree(22,0);
		map.addTree(22,2);
		map.addTree(22,4);
		map.addTree(22,6);
		map.addTree(22,8);
		map.addTree(22,10);
		map.addTree(22,12);
		map.addTree(22,14);
		map.addTree(22,16);
		map.addTree(22,18);
		map.addTree(22,20);
		map.addTree(22,22);
		
		map.addTree(2,22);
		map.addTree(4,22);
		map.addTree(6,22);
		map.addTree(8,22);
		map.addTree(10,22);	
		map.addTree(12,22);
		map.addTree(14,22);
		map.addTree(16,22);
		map.addTree(18,22);
		map.addTree(20,22);
		
		map.addTree(2,0);
		map.addTree(4,0);
		map.addTree(6,0);
		map.addTree(8,0);
		map.addTree(10,0);	
		map.addTree(12,0);
		map.addTree(14,0);
		map.addTree(16,0);
		map.addTree(18,0);
		map.addTree(20,0);
		
		map.addTree(14, 10);
		map.addTree(6, 10);
		map.addTree(10, 14);
		map.addTree(10, 6);
		
		map.addGrass(4,10);
		map.addGrass(4,10);
		map.addGrass(3,11);
		map.addGrass(3,11);
		
		map.addGrass(4,4);
		map.addGrass(4,5);
		map.addGrass(3,4);
		map.addGrass(3,5);
		map.addGrass(5,4);
		map.addGrass(5,5);
		map.addGrass(4,6);
		map.addGrass(3,6);
		
		map.addGrass(18,4);
		map.addGrass(19,5);
		map.addGrass(18,4);
		map.addGrass(18,5);
		map.addGrass(17,4);
		map.addGrass(17,5);
		map.addGrass(19,6);
		map.addGrass(18,6);
		
		
		map.addGrass(18,19);
		map.addGrass(19,17);
		map.addGrass(18,19);
		map.addGrass(18,17);
		map.addGrass(17,19);
		map.addGrass(17,18);
		map.addGrass(19,17);
		map.addGrass(18,18);
		map.addGrass(19,19);
		map.addGrass(19,18);
		
		
		map.addGrass(5,19);
		
		map.addGrass(5,19);

		map.addGrass(7,19);
		map.addGrass(7,18);
	
		map.addGrass(5,18);
		map.addGrass(6,19);
		map.addGrass(6,18);
		
		map.addOldMan(10, 8);
		
		
	//
	

			GameObject player = new Player(390, 380, ID.Player,11,10,10,0);
			handler.object.add(player);
			
			this.addKeyListener(new KeyInput(handler,player,map,battle));
		

			
			
			
		new Window(WIDTH,HEIGHT,"Pokemon Beta",this);

	}
	
	public synchronized void start()
	{
		thread = new Thread(this);
		thread.start();
		running=true;
	}
	public synchronized void stop()
	{
		try{
			thread.join();
			running=false;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void run(){
		 long lastTime = System.nanoTime();
	        double amountOfTicks = 60.0;
	        double ns = 1000000000 / amountOfTicks;
	        double delta = 0;
	        long timer = System.currentTimeMillis();
	        int frames = 0;
	        while(running)
	        {
	                    long now = System.nanoTime();
	                    delta += (now - lastTime) / ns;
	                    lastTime = now;
	                    while(delta >=1)
	                            {
	                                tick();
	                                delta--;
	                            }
	                            if(running)
	                                render();
	                            frames++;
	                            
	                            if(System.currentTimeMillis() - timer > 1000)
	                            {
	                                timer += 1000;
	                               
	                                frames = 0;
	                            }
	        }
	                stop();
	                
	}
	private void tick(){
		handler.tick();
		battle.tick();
	}
	private void render(){
		BufferStrategy bs = this.getBufferStrategy();
		if(bs==null)
		{
		this.createBufferStrategy(3);
		return;
		}
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	
	

		
		handler.render(g);
		 battle.start(g);

	
		
		g.dispose();
		bs.show();
	}
	
	public static void main(String args[]){
		new PokemonMainFrame();
	}
}
