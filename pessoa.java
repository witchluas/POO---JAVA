package membros;
import java.util.Date;
public class pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;
	
	public pessoa (String _nome, String _cpf, Date _data){
		
		this.nome =_nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
		
	}
}
