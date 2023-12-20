package loop;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("quantos alunos tem na sua sala de aula?");
		int resp = entrada.nextInt();
		double media =0;
		double soma = 0;
		int cont = 0;
		while(cont < resp) {
			System.out.print("Digite a nota: ");
			double nota = entrada.nextDouble();
			soma = soma + nota;
			cont ++;
			
			
			
		}
		
		media = soma/resp;
		System.out.println(media);
		entrada.close();
		
		
		
		

	}

}
