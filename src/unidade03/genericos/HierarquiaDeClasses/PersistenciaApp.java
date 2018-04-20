package unidade03.genericos.HierarquiaDeClasses;
import unidade01.Pacotes.Uni.Classes.Administrativo;
import unidade01.Pacotes.Uni.Classes.Diretor;

public class PersistenciaApp {
	
	public static void main(String[] args) {
		GenericDAO<Administrativo> admin = new GenericDAO<>(); // aqui est� sendo criado um tipo de objeto que se encontra no primeiro pacote do curso
		admin.create(new Administrativo()); // esse c�digo deixa o trabalho mais flexivel, nesse caso ele est� simulando um create do banco
		
		GenericDAO<Diretor> diretor = new GenericDAO<>(); // perceba que a unica coisa que muda � o objeto que � uinformado
		diretor.create(new Diretor()); // isso deixaria o trabalho mais pr�tico
	}

}
