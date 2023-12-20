package arrays;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		
		int[] array1 = new int[10], array2 = new int[10], array3 = new int[10], array4 = new int[10];
		
		for(int i=0; i<array1.length; i++ ) {
			System.out.printf("\nDigite o %d valor: ", i+1);
			int num = entrada.nextInt();
			array1[i] = num;
		}
		for(int x = 0; x<array1.length;x++){
			System.out.print(array1[x] + " ");
		}
		for(int i=0; i<array2.length; i++ ) {
			System.out.printf("\nDigite o %d valor: ", i+1);
			int num = entrada.nextInt();
			array2[i] = num;
		}
		for(int x = 0; x<array2.length;x++){
			System.out.print(array2[x] + " ");
		}
		for(int i=0; i<array3.length; i++ ) {
			System.out.printf("\nDigite o %d valor: ", i+1);
			int num = entrada.nextInt();
			array3[i] = num;
		}
		for(int x = 0; x<array3.length;x++){
			System.out.print(array3[x] + " ");
		}
		for(int i=0; i<array4.length; i++ ) {
			System.out.printf("\nDigite o %d valor: ", i+1);
			int num = entrada.nextInt();
			array4[i] = num;
		}
		for(int x = 0; x<array4.length;x++){
			System.out.print(array4[x] + " ");
		}
	}	
	

}
