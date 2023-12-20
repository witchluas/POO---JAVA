package fim;

public class Triatleta implements ciclista, nadador, corredor {

	public String aquecer() {
		return "Esta aquecendo...";
	}

	public String correr() {
		return "Esta correndo...";
	}
	
	public String nadar() {
		return "Esta nadando...";
	}

	public String pedalar() {
		return null;
	}
}
