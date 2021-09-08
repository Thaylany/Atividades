package aula;

public class Q2 {

	public static void main(String[] args) {
		int x, y;
		
		for(x = -100; x <=100; x++)
			for(y = -100; y <= 100; y++)
				if (x+y == 100 || x+y == -100)
					System.out.println(x +" + " + y + " = " + (x+y));
			
	}

}


