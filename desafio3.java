package Fundamentos;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp1 = entrada.nextDouble();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp2 = entrada.nextDouble();
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp3 = entrada.nextDouble();
		
		if (resp1>resp2 && resp1>resp3) {
			System.out.println("O primeiro numero e maior");

				if (resp2>resp3) {
					System.out.println("O terceiro numero e o menor");
					
				}else {
					System.out.println("O segundo numero e o menor");
				}
		}else if (resp2>resp3) {
				if (resp1<resp3) {
					System.out.println("O segundo numero e maior e o primeiro e menor");
				}else 
					System.out.println("O segundo numero e o maior e o terceiro e o menor");
		}else 
			if (resp1<resp2) {
				System.out.println("O terceiro e o maior e o primeiro e o menor ");
			}else {
				System.out.println("O primeiro e maior e segundo e o menor");
			}
		
		

	}

}
