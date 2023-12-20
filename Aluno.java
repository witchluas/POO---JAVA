package membros;
import java.util.Date;
public class Aluno extends pessoa{
	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public String matricula;
}
