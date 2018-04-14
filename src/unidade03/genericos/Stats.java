package unidade03.genericos;

public class Stats<T extends Number> {
	
	T[] obj;
	
	public Stats(T[] obj){
		this.obj = obj;
	}
	
	Double media(){
		double soma = 0;
		int i = 0;
		for (i = 0; i < obj.length; i++) {
			soma += obj[i].doubleValue();
			
		}
		return soma / i;
	}

}
