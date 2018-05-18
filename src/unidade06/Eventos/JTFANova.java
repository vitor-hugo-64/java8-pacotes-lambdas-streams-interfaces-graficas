package unidade06.Eventos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTFANova extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		JTFANova frame = new JTFANova();
		frame.setTitle("Primeira Aplicação");
		frame.setSize( 350, 250);
		Container cont = frame.getContentPane();
		JTextField tf = new JPasswordField("Digite aqui");
		tf.addActionListener(frame);
		cont.add( tf, BorderLayout.NORTH);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		JOptionPane.showMessageDialog( null, ev.getActionCommand().toString());
	}

}
