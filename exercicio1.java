package arrays;

public class exercicio1 {

	public static void main(String[] args) {
		int soma3=0, soma5=0;
		// TODO Auto-generated method stub
		for (int i = 1; i <=20; i ++) {
			if (i% 3 == 0) {
				soma3=soma3+i;
				
			}
			if (i% 5 == 0) {
				soma5+=i;
	
			}
			}
			
			
		System.out.println("A soma de 3 e: " + soma3);
		System.out.println("A soma de 5 e: " + soma5);
		System.out.println("A soma de 3 e 5 e: " + (soma3 + soma5));
	
		
		

	}

}
