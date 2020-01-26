package com.pokemon.main;

import java.awt.Image;

public class Pokemon {

	protected String name;
	protected Image image;
	protected int health;
	protected int trueHealth;
	protected int attack;
	protected Image image2;
	protected String[] moves;
   private boolean poison =false;
	private boolean paralysis=false;
	private boolean burn=false;
	private String type;
	private int defBoost=0;
	private int attackBoost=0;
	
	public Pokemon(String s, Image i, int h, int th,int a, String type)
	{
		name= s;
		image =i;
		health=h;
		attack=a;
		trueHealth=th;
		this.type = type;
	}
	
	public void setPoison(Boolean s)
	{
		poison=s;
	}
	public boolean getPoison()
	{
		return poison;
	}
	public void setParalysis(Boolean s)
	{
		paralysis=s;
	}
	public boolean getBurn()
	{
		return burn;
	}
	public void setBurn(Boolean s)
	{
		burn=s;
	}
	public boolean getParalysis()
	{
		return paralysis;
	}
	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
	}
	public void setMoves(String[] s)
	{
		moves=s;
	}
	public String[] getMoves()
	{
		return moves;
	}
	public int gettrueHealth()
	{
		return trueHealth;
	}
	public void setImage(Image s)
	{
		image=s;
	}
	public Image getImage()
	{
		return image;
	}
	public void setImage2(Image s)
	{
		image2=s;
	}
	public Image getImage2()
	{
		return image2;
	}
	public void setAttack(int s)
	{
		attack=s;
	}
	public int getAttack()
	{
		return attack;
	}
	public void setHealth(int s)
	{
		health=s;
	}
	public int getHealth()
	{
		return health;
	}
}
