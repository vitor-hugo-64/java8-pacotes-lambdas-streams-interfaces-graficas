package unidade05.Sintaxe;

public class ValidatorApp {
	
	public static void main(String[] args) {
		String celular = "99113-4566";
		Validator<String> validacao = valor->valor.matches("[0-9]{5}-[0-9]{3}");;
		System.out.println(validacao.valida(celular));
		
	}

}
