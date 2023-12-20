package E_VERDADE;

public class animaiszinhos {

	public static void main(String[] args) {
		animais_de_estimacao x = new animais_de_estimacao();
		
		x.setClasse("gato");
		String classe = x.getClasse();
		
		x.setNome("noir");
		String nome = x.getNome();
		
		x.setIdade(2);
		int idade = x.getIdade();
		
		x.setClasse("Gato");
		System.out.println(classe + " " + nome + " " + idade);
		
		x.setClasse("cachorro");
		String classe1 = x.getClasse();
		
		x.setNome("auau");
		String nome1 = x.getNome();
		
		x.setIdade(3);
		int idade1 = x.getIdade();
		
		System.out.println(classe1 + " " + nome1 + " " + idade1);
		
		
		
	}
	
	
}
