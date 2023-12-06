package JAVA_POO;

public class JAVA_POO_EXERCICIO_CARRO {
	 String cor;
	 double preco;
	 String modelo;
	
	/*CONSTRUTOR PADRÃO */
	public JAVA_POO_EXERCICIO_CARRO() {
		
	}
	public JAVA_POO_EXERCICIO_CARRO(String modelo, double preco){
	this.cor = "PRETA";
	this.modelo = modelo;
	this.preco = preco;
	}
	public JAVA_POO_EXERCICIO_CARRO(String cor, String modelo, double preco) {
	this.cor = cor;
	this.modelo = modelo;
	this.preco = preco;
	}

}
