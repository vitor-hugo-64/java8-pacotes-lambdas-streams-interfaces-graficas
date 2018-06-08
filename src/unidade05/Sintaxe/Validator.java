package unidade05.Sintaxe;

@FunctionalInterface
public interface Validator<T> {
	boolean valida(T t);
}
