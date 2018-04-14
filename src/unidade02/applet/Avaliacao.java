package unidade02.applet;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Avaliacao extends JApplet {

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		String entrada = JOptionPane.showInputDialog("Informe A Nota: ");
		float nota = Float.parseFloat(entrada);
		
		if (nota<0 || nota>100) {
			JOptionPane.showMessageDialog( null, "Not� Inv�lida!");
			paint(null);
		} else {
			
			if (nota < 50) {
				JOptionPane.showMessageDialog( null, "Not� Insuficiente!");
			} else if(nota < 70){
				JOptionPane.showMessageDialog( null, "Not� Regular!");
			} else if(nota < 90) {
				JOptionPane.showMessageDialog( null, "Not� Bom!");
			} else if(nota < 100) {
				JOptionPane.showMessageDialog( null, "Not� Excelente!");
			}
			System.exit(0);
		}
	}
	
}
