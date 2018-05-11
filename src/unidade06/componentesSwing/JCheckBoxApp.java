package unidade06.componentesSwing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxApp {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Aplica��o");
		f.setSize( 250, 250);
		Container cont = f.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(new JCheckBox("1 - Sim"));
		cont.add(new JCheckBox("2 - N�o"));
		f.setVisible(true);
	}

}
