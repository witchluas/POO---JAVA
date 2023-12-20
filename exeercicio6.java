package arrays;
import java.util.Scanner;

public class exeercicio6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] alunos = new double [5];
		Scanner entrada = new Scanner(System.in);
		
			
		for(int i=0; i<alunos.length; i++ ) {
			System.out.printf("Digite sua nota: ", i+1);
			double nota = entrada.nextDouble();
			alunos[i] = nota;
		}
		double soma = 0;
		for(int x = 0; x<alunos.length;x++){
			soma += alunos[x];
		}
		System.out.print(soma/alunos.length);

	}

}
