package arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
public class exerciciojava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String str = entrada.nextLine();

		StringTokenizer frase = new StringTokenizer(str);
		System.out.println(frase.countTokens());
		

	}

}
