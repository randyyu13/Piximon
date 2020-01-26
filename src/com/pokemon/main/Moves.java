package com.pokemon.main;

public class Moves {

	private String name;
	private int dmg =0;
	private boolean poison =false;
	private boolean paralysis=false;
	private boolean burn=false;
	private String type;
	private int defBoost=0;
	private int attackBoost=0;
	

	public Moves()
	{

	}

	public void Thunder()
	{
		name="Thunder";
	    dmg=10;
		 poison=false;
	     paralysis=false;
		 burn=false;
		 type="electric";
		 defBoost=0;
		 attackBoost=0;
		 
	}
	public void quickAttack()
	{
		name="quickAttack";
	    dmg=3;
		 poison=false;
	     paralysis=false;
		 burn=false;
		 type="normal";
		 defBoost=0;
		 attackBoost=0; 
	}
	public void Slam()
	{
		name="Slam";
	    dmg=5;
		 poison=false;
	     paralysis=false;
		 burn=false;
		 type="normal";
		 defBoost=0;
		 attackBoost=0; 
	}
	public void Spark()
	{
		name="Spark";
	    dmg=8;
		 poison=false;
	     paralysis=false;
		 burn=false;
		 type="electric";
		 defBoost=0;
		 attackBoost=0; 
	}
	public String getName()
	{
		return name;
	}
	public int getDmg()
	{
		return dmg;
	}
	public boolean getPoison()
	{
		return poison;
	}
	public boolean getParalysis()
	{
		return paralysis;
	}
	public boolean getBurn()
	{
		return burn;
	}
	public String getType()
	{
		return type;
	}
	public int defBoost()
	{
		return attackBoost;
	}

}
