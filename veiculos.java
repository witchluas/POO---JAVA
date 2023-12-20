package transporte;

public class veiculos {
	public String modelo;
	public String cor;
	public int ano;
	
	public veiculos (String modelo, String cor, int ano){
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	public void locomover() {
		System.out.println("Andou...");
	}
	public void freiar() {
		System.out.println("Freiou...");
	}
}

