package unidade02.applet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class AloMundo extends JApplet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() { // excuta quando o applet iniciar
		System.out.println("Inicializando!");
	}
	
	@Override
	public void paint(Graphics g) { // isso é o que vai ser desenhado
		g.drawRect( 0, 0, 150, 150); // desenha um retangulo
		g.setColor(Color.CYAN); // determina a cor
		g.setFont(new Font("Times New Roman", Font.BOLD, 16)); // determina a font
		g.drawString( "Alo Mundo", 20, 20); // desenha a string
	}
	
	@Override
	public void start() { // executa durante a execucao do applet
		System.out.println("Executando!");
	}
	
	@Override
	public void stop() { // executa quando a execucao do applet para
		System.out.println("Parando!");
	}
	
	@Override
	public void destroy() { // executa quando o applet é eliminado
		System.out.println("Eliminando!");
	}

}
