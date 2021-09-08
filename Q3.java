package aula;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num100 = 0, num50 = 0, num10 = 0, num5 = 0, num1 = 0, saque, valor = 0,
			a, b, c, d, e;
		
		System.out.println("Informe um valor minímo de R$10 até o máximo de R$600 para saque.");
		saque = sc.nextInt();
		
		if(saque >= 10 && saque <= 600) {
			valor = saque;
		
			num100 = valor % 100;
			a = valor / 100;
			valor -= num100;
			
			num50 = num100 % 50;
			b = num100 / 50;
			valor -= num50;
			
			num10 = num50 % 10;
			c = num50 / 10;
			valor -= num10;
			
			num5 = num10 % 5;
			d = num10 / 5;
			valor -= num5;
			
			num1 = num5 % 5;
			e = num5 / 1;
			
			
			System.out.printf("Para sacar R$%d, o programa fornece %d nota(s) de 100, "
								+ "%d nota(s) de 50, %d nota(s) de 10, %d nota(s) de 5 e "
								+ "%d nota(s) e 1.",
								saque, a, b, c, d, e);
		}else
			System.out.println("Valor incoreto! Tente Novamente.");
	
	}

}
