package com.pokemon.main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class OldMan extends GameObject{

	public OldMan(int x, int y, ID id) {
		super(x, y, id);
	}

	public void tick() {
		// TODO Auto-generated method stub
		
	}

	public void render(Graphics g) {
		ImageIcon ii;
		ii = new ImageIcon(this.getClass().getResource("oldman.png"));
		Image img = ii.getImage();
		Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, x, y, null);
		
	}
	

}