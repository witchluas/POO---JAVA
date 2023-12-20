package transporte;

public class cidade {

	public static void main(String[] args) {
	
		carro c1 = new carro("Fusca", "preto", 1960);
		c1.motor = "1600";
		c1.combustivel = "Etanol";
		c1.portas = 5;
		c1.locomover();
		
		bicicleta b1 = new bicicleta("monark", "rosa", 2005);
		b1.tracao = "jumento";
		c1.freiar();
		
		moto m1 = new moto("Harley Dayvsson", "preto", 2019);
		m1.rodas = 2;

	}

}
