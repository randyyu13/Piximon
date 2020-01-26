package com.pokemon.main;

import java.awt.Image;

public class Pikachu {

	protected String name;
	protected Image image;
	protected int health;
	protected int trueHealth;
	protected int attack;
	public boolean poison =false;
    public boolean paralysis=false;
	public boolean burn=false;
	
	public Pikachu(String s, Image i, int h, int th,int a)
	{
		name= s;
		image =i;
		health=h;
		attack=a;
		trueHealth=th;
	}
	
	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
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