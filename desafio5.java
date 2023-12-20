package Fundamentos;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite sua nota 1: ");
		double resp1 = entrada1.nextDouble();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite sua nota 2: ");
		double resp2 = entrada2.nextDouble();
		double media = ((resp1 + resp2) /2);
	
		if (media >=7) {
			System.out.println("Aprovado!");
		
		}else if (media<7) {
				System.out.println("Recuperacao!");
		} else {
			System.out.println("Reprovado...");
		
		}
		
		
		
		
		
		
	}

}
