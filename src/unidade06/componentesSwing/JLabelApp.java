package unidade06.componentesSwing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelApp {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira Aplica��o");
		frame.setSize( 350, 250);
		Container cont = frame.getContentPane();
		cont.setLayout(new GridLayout( 2, 1));
		cont.add(new JLabel("Isto � uma Label!!!"));
		frame.setVisible(true);
	}

}
