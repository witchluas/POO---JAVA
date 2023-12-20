package loop;
import java.util.Scanner;
public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int x = numero.nextInt();
		
		if(x % 2 == 0) {
			System.out.println(x/2);
		}
		else {
			System.out.println(3* x + 1);
		}
	}

}
