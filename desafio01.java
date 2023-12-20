package Fundamentos;
import java.util.Scanner;

public class desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = entrada.nextDouble();
		if (resp > 0 == false )
			System.out.println("Negativo");
		else {
			System.out.println("Positivo");
		}
		
		System.out.println(resp);
	}

}
