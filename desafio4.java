package Fundamentos;
import java.util.Scanner;
public class desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = entrada.nextDouble();
		
		if (resp == 1) {
			System.out.println("Domingo");
		
		}else if (resp == 2) {
			System.out.println("Segunda-feira");
		
		}else if (resp == 3) {
			System.out.println("Terça-feira");
		
		}else if (resp == 4) {
			System.out.println("Quarta-feira");
		
		}else if (resp == 5) {
			System.out.println("Quinta-feira");
		}else if (resp == 6) {
			System.out.println("Sexta-feira");
		}else if (resp == 7) {
			System.out.println("Sabado-feira");
		}else {
			System.out.println("Digite um numero valido");
		}
	}

}
