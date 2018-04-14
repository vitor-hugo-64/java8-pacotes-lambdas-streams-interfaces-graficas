package unidade03.genericos;

public class ExemploGenerics2<T, V> {

	T obj;
	V obj2;

	public ExemploGenerics2(T obj, V obj2){
		this.setObj(obj);
		this.setObj2(obj2);
	}
	
	public V getObj2() {
		return obj2;
	}

	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}


	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void showType(){
		System.out.println(obj.getClass().getName());
		System.out.println(obj2.getClass().getName());
	}

}
