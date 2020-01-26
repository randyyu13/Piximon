package com.pokemon.main;

public class MapArray {

	private Map[][]map=new Map[24][24];
	private Handler handler;
	
	public MapArray(Handler h)
	{
		handler = h;
		for(int row=0;row<24;row++)
			for(int col=0;col<24;col++)
				map[row][col]=new Map(0,0,"null",handler);
	}
	
	
	
	public void paint()
	{
		for(int x=0;x<21;x++)
			for(int y=0;y<21;y++)
				map[x][y].Paint();
	}
	public void addGrass(int row, int col)
	{
		map[row][col]=new Map(row*40,col*40,"Grass",handler);
		map[row][col].Paint();
	}
	public void addOldMan(int row, int col)
	{
		map[row][col]=new Map(row*40,col*40,"OldMan",handler);
		map[row][col].Paint();
	}
	public void addTree(int row, int col)
	{
		map[row][col]=new Map(row*40,col*40,"TreeTopLeft",handler);
		map[row][col].Paint();
		map[row][col+1]=new Map(row*40,col*40,"TreeTopRight",handler);
		map[row][col+1].Paint();
		map[row+1][col]=new Map(row*40,col*40,"TreeBottomLeft",handler);
		map[row+1][col].Paint();
		map[row+1][col+1]=new Map(row*40,col*40,"TreeBottomRight",handler);
		map[row+1][col+1].Paint();
		
		
	}
public Map getTile(int x, int y)
{
	return map[x][y];
}
	public void remove(int row, int col)
	{
		map[row][col]=null;
	}

	
}
