package com.pokemon.main;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Player extends GameObject {


private int pos;
private int locationX;
private int locationY;
private int pokeballStock;



	public Player(int x, int y, ID id, int z,int locX,int locY,int pkbs) {
		super(x, y, id);
	pos=z;
	locationX=locX;
	locationY=locY;
	pokeballStock=pkbs;
	}
	public void setPos(int x)
	{
		pos=x;
	}
	public int getPos()
	{
		return pos;
	}
	public void setLocX(int x)
	{
		locationX = x;
	}
	public void setLocY(int y)
	{
		locationY = y;
	}
	public int getLocX()
	{
	return locationX;
	}
	public int getLocY()
	{
		return locationY;
	}




	public void tick() {
		
	}

	public void render(Graphics g) {
		ImageIcon ii;
		if(pos==11)
		ii = new ImageIcon(this.getClass().getResource("Down1.png"));
		else if(pos==12)
			ii = new ImageIcon(this.getClass().getResource("Down2.png"));
		else if(pos==13)
			ii = new ImageIcon(this.getClass().getResource("Down3.png"));
		else if(pos==14)
			ii = new ImageIcon(this.getClass().getResource("Down4.png"));
		else if(pos==21)
			ii = new ImageIcon(this.getClass().getResource("Left1.png"));
		else if(pos==22)
			ii = new ImageIcon(this.getClass().getResource("Left2.png"));
		else if(pos==23)
			ii = new ImageIcon(this.getClass().getResource("Left3.png"));
		else if(pos==24)
			ii = new ImageIcon(this.getClass().getResource("Left4.png"));
		else if(pos==31)
			ii = new ImageIcon(this.getClass().getResource("Right1.png"));
		else if(pos==32)
			ii = new ImageIcon(this.getClass().getResource("Right2.png"));
		else if(pos==33)
			ii = new ImageIcon(this.getClass().getResource("Right3.png"));
		else if(pos==34)
			ii = new ImageIcon(this.getClass().getResource("Right4.png"));
		else if(pos==41)
			ii = new ImageIcon(this.getClass().getResource("Up1.png"));
		else if(pos==42)
			ii = new ImageIcon(this.getClass().getResource("Up2.png"));
		else if(pos==43)
			ii = new ImageIcon(this.getClass().getResource("Up3.png"));
		else 
			ii = new ImageIcon(this.getClass().getResource("Up4.png"));
		Image img = ii.getImage();
		Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, x, y, null);
		
	}
	

}
