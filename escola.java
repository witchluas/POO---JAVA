package membros;
import java.util.Date;
public class escola {

	public static void main(String[] args) {
		
		Aluno i = new Aluno("Luanna", "71211144455", new Date());
		System.out.println(i.nome);
		System.out.println("CPF: " + i.cpf);
		System.out.println("Data de Nascimento: " + i.data_nascimento.toString());
		
		
	}

}
