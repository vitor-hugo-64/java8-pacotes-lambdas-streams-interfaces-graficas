package unidade04.InterfaceSet.abcTreinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	
	Set<Curso> cursos;
	
	public static void main(String[] args) {
		
		Curso java8 = new Curso("Java 8");
		Curso Oracle12c = new Curso("Oracle12c");
		
		Set<Curso> cursosA = new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();
		
		cursosA.add(java8);
		cursosA.add(Oracle12c);
		cursosB.add(java8);
		
		// intersec��o
		cursosA.retainAll(cursosB);
		System.out.println(cursosA);
		
		// diferen�a de 'A' pra 'B', cursos que 'A' tem e o 'B' n�o tem
		cursosB.removeAll(cursosB);
		System.out.println(cursosA);
		
		Cliente A = new Cliente();
		A.setCursos(cursosA);
		Cliente B = new Cliente();
		B.setCursos(cursosB);
		
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}
