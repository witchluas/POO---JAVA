package Fundamentos;
import java.util.Scanner;

public class desafio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		char letra = entrada.next().charAt(0);
		
		if (letra == 'F') {
			System.out.println("FEMININO");
		
		}else if (letra == 'M') {
			System.out.println("MASCULINO");
		
		}else {
			System.out.println("Letra Invalida! ");
		}
	}

}
