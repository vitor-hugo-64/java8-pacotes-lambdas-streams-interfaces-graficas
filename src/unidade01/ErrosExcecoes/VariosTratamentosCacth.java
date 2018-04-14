package unidade01.ErrosExcecoes;

public class VariosTratamentosCacth {
	
	public static void main(String[] args) {
		try {
			int i = 50;
			i = i / 0; // essa linha ira gerar erro de aritmetica
			System.out.println(i);
			Object c = null; // essa linha ira gerar erro de ponto nulo
			System.out.println(c.toString());
		} catch(ArithmeticException | NullPointerException c){ // para tratar esse dois erros se usa o multicatch
			c.printStackTrace();
		}

	}

}
