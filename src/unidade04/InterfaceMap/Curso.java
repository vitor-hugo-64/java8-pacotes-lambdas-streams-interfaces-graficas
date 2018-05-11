package unidade04.InterfaceMap;

import java.nio.file.Path;

public class Curso {
	
	int cdCurso;
	String nome;
	float valor;
	Path url; // classe que armazena enderecos de site
	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}	
	
}
