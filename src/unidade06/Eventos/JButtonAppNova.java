package unidade06.Eventos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JButtonAppNova extends JFrame implements ActionListener, WindowListener {
	
	public UIManager.LookAndFeelInfo looks[]; // atributo para mudar a interface gráfica
	
	public static void main(String[] args) {
		JButtonAppNova frame = new JButtonAppNova();
		frame.setTitle("Primeira Aplicação");
		frame.setSize( 350, 250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		JButton botao = new JButton("Isto é um botão");
		botao.addActionListener(frame);
		cont.add(botao);
		frame.addWindowListener(frame);
		
		frame.looks = UIManager.getInstalledLookAndFeels(); // configura a interface gráfica
		
		// tratamento da interface
		try {
			
			UIManager.setLookAndFeel(frame.looks[3].getClassName()); // o numero tres é o numero da interface que está sendo usado
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog( null, arg0.getActionCommand().toString());
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog( null, "encerrando...");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
