package unidade03.genericos;

// os genéricos são como se fosse tipos de objetos que podem receber diferentes tipos de objeto
// eles são mutaveis, de acordo com a aquilo que voce informa

// nesse caso quando for instanciado a classe ela vai receber um tipo de objeto de dado que sera armazenado no parametro 'T'
public class ExemploGenerics<T> {
	
	T obj; // esse tipo primitivo irá criar uma variavel
	
	// e aqui será feito todo tipo de ação com base nesse tipo de dado
	public ExemploGenerics(T obj){
		super();
		this.setObj(obj);;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void showType(){
		System.out.println(obj.getClass().getName());
	}
	
}
