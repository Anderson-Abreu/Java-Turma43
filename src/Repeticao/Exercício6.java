package LacoRepeticao;

import java.util.Scanner;

public class Exerc�cio6 {

	public static void main(String[] args) {
		int n,media=0,soma=0,cont=0;
		do {
			Scanner cal = new Scanner(System.in);
			System.out.print("Digite um n�mero: ");
			n=cal.nextInt();
			if(n%3==0)
			{
				soma+=n;
				cont++;
			}
		}while(n!=0);
		media=soma/cont;
		System.out.println("A m�dia dos valores multiplos de 3 � "+media);
	}

}
