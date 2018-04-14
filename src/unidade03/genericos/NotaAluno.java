package unidade03.genericos;

public class NotaAluno {
	
	double nota;
	
	<T extends Number>NotaAluno(T obj){
		nota = obj.doubleValue();
	}
	
	<T extends Number>double retornarNota(T obj){ // metodo generico que retorna o valor do objeto em forma de double
		return obj.doubleValue();
	}

}
