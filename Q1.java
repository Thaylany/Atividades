package aula;

public class Q1 {

	public static void main(String[] args) {
		
		System.out.println("n! |");
		
		long soma = 1, i;
		for( i = 1; i <= 20; i++) {
			soma *= i;
			
			System.out.println(i + "! | " + soma);
			
		}
	}

}
