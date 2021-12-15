package LacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int n,soma=0;
		do {
			Scanner cal = new Scanner(System.in);
			System.out.print("Digite um número: ");
			n=cal.nextInt();
			soma+=n;
		}while(n!=0);
		System.out.println("A soma dos números digitados é "+soma);
	}

}
