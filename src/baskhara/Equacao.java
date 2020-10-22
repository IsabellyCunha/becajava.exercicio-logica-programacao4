package baskhara;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double delta, a, b, c, x1, x2;
		
		System.out.print("Insira o valor de a: ");
		a = leitor.nextDouble();
		
		System.out.print("Insira o valor de b: ");
		b = leitor.nextDouble();
		
		System.out.print("Insira o valor de c: ");
		c = leitor.nextDouble();
		
		delta = (b*b) - (4*a*c);
		
		x1 = (-b + (Math.sqrt(delta)))/(2*a);
		x2 =  (-b - (Math.sqrt(delta)))/(2*a);
		
		System.out.print("O valor de x1 é: " + x1 + "\nO valor de x2 é: " + x2);
		
		
	}

}
