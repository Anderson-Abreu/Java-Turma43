package LacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int x, n,p=0,i=0;
		for(x=0;x<10;x++)
		{
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um numero: ");
			n=ler.nextInt();
			if(n%2==0)
				p++;
			else
				i++;
		}
		System.out.println("Você digitou "+p+" numeros pares e "+i+" numeors impares");
	}

}
