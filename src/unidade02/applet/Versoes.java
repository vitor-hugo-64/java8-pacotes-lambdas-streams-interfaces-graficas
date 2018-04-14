package unidade02.applet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Versoes extends JApplet {
	
	@Override
	public void init() {
		System.out.println("Iniciando!");
	}
	
	@Override
	public void paint(Graphics g) {
		this.setBackground(Color.GREEN);
		g.setColor(Color.BLUE);
		this.setSize( 400, 100);
		g.setFont( new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("Versão Do Java: " + System.getProperty("java.version"), 20, 20);
		g.drawString("Versão Do Java: " + System.getProperty("os.name"), 50, 50);
	}

}
