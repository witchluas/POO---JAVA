package arrays;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int mult[] = new int[5];
		int[] numeros = new int [5];
		int[] soma2= new int [5];
		
		
		for (int i = 0; i <5; i ++) {
			System.out.printf("Digite um numero: ", i+1);
			numeros[i] = entrada.nextInt();
		}
		for (int y = 0; y<5; y++) {
			mult[y]= numeros[y]*2;

		}
		for(int x = 0; x <5; x++) {
			soma2[x] = numeros[x]+mult[x];
		
		}
		for(int i = 0; i <5; i ++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		for(int i = 0; i <5; i ++) {
			System.out.print(mult[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i <5; i ++) {
			System.out.print(soma2[i] + " ");
		}
	}

}
