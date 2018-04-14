package unidade03.genericos;

// os gen�ricos s�o como se fosse tipos de objetos que podem receber diferentes tipos de objeto
// eles s�o mutaveis, de acordo com a aquilo que voce informa

// nesse caso quando for instanciado a classe ela vai receber um tipo de objeto de dado que sera armazenado no parametro 'T'
public class ExemploGenerics<T> {
	
	T obj; // esse tipo primitivo ir� criar uma variavel
	
	// e aqui ser� feito todo tipo de a��o com base nesse tipo de dado
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
