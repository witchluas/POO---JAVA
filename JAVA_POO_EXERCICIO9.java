package JAVA_POO;

public class JAVA_POO_EXERCICIO9 {

	public static void main(String[] args) {
		JAVA_EXERCICIO_POO8 calculadora = new JAVA_EXERCICIO_POO8();
		JAVA_POO_EXERCICIO10 calculadora1 = new JAVA_POO_EXERCICIO10();
		
		int calc = calculadora.somar(1,1);
		System.out.println(calc);
		
		int calc1 = calculadora.somar(2, 15, 2);
		System.out.println(calc1);
		
		double calc2 = calculadora1.mult(50, 5);
		System.out.println(calc2);
		
		double calc3 = calculadora1.mult(50, 1, 10);
		System.out.println(calc3);
		
	}

}
