package unidade06.caixasDeDialogo;

import javax.swing.JOptionPane;

public class DialogApp {
	
	public static void main(String[] args) {
		
		// Primeira mesangem � o conte�do, a segunda � o t�tulo e o terceiro � o simbolo que ir� aparecer na caixa de dialogo
		JOptionPane.showMessageDialog(null, "Iniciando A Aplica��o...", "Instala��o Conclu�da", JOptionPane.INFORMATION_MESSAGE);
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome: ");
		
		int resposta = JOptionPane.showConfirmDialog( null, "O nome " + nome + " foi informado!");
		
		JOptionPane.showMessageDialog( null, "Resposta: " + resposta);
		
	}

}
