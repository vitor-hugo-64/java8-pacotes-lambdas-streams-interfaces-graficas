package unidade06.componentesSwing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPFA {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplica��o");
		frame.setSize( 350, 250);
		Container cont = frame.getContentPane();
		JTextField tf = new JPasswordField("Digite aqui");
		cont.add( tf, BorderLayout.NORTH);
		frame.setVisible(true);
	}

}
