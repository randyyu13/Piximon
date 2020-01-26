package com.pokemon.main;

public class Map {
	
	private int x;
	private int y;
	private Handler handler;
	private String type;

	public Map(int a,int b,String s, Handler h)
	{
		x=a;
		y=b;
		type =s;
		handler = h;
		
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}

	public void setX(int a)
	{
		x=a;
	}
	public void setY(int b)
	{
		y=b;
	}

	public void Paint()
	{
		if(type=="OldMan")
			handler.object.add(new OldMan(x-10,y,ID.OldMan));
		if(type=="TreeTopLeft")
			handler.object.add(new Tree(x-10, y, ID.Tree));
		
		if(type=="Grass")
			handler.object.add(new Grass(x, y, ID.Grass));
	}

	public String getType()
	{
		return type;
	}
	public void setType(String s)
	{
		type=s;
	}
	public boolean canWalk()
	{
		if(type.equals("TreeTopLeft")||type.equals("TreeTopRight")||type.equals("TreeBottomLeft")||type.equals("TreeBottomRight")||type.equals("OldMan"))
			return false;
		return true;
			
	}
}

