package unidade06.caixasDeDialogo;

import javax.swing.JOptionPane;

public class DialogApp {
	
	public static void main(String[] args) {
		
		// Primeira mesangem é o conteúdo, a segunda é o título e o terceiro é o simbolo que irá aparecer na caixa de dialogo
		JOptionPane.showMessageDialog(null, "Iniciando A Aplicação...", "Instalação Concluída", JOptionPane.INFORMATION_MESSAGE);
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome: ");
		
		int resposta = JOptionPane.showConfirmDialog( null, "O nome " + nome + " foi informado!");
		
		JOptionPane.showMessageDialog( null, "Resposta: " + resposta);
		
	}

}
