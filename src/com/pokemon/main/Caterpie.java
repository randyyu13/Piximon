package com.pokemon.main;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Caterpie extends Pokemon {

	public Caterpie()
	{		
	
		super("Caterpie",null,50,50,5,"grass");
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource("Caterpie.png"));
		Image img = ii.getImage();
		this.setImage(img);

	}
}
