package fim;

public class competicao {

	public static void main(String[] args) {
		Triatleta t1 = new Triatleta();;
		t1.nome = "luanna";
		t1.idade = 21;
		t1.aquecer();
		String aquecer = t1.aquecer();
		
		System.out.println(t1.nome+" " + t1.idade +" "+ "e" + aquecer);

	}

}
