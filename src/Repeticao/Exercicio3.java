package LacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int idade, n=0, v=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade ou digite -99 para encerrar: ");
		idade=ler.nextInt();
		while(idade!=-99)
		{
			if(idade<21)
				n++;
			if(idade>50)
				v++;
			System.out.println("Digite sua idade ou digite -99 para encerrar: ");
			idade=ler.nextInt();
		}
		System.out.println("Foram digitadas "+n+" idades menores de 21 e "+v+" idades maiores de 50");
	}

}
