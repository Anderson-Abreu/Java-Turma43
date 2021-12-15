package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		double n1,n2,soma;
		String resp;
		Scanner ler = new Scanner(System.in);
				
		do
		{
			System.out.println("Digite o numero:");
			n1=ler.nextDouble();
			System.out.println("Digite o numero");
			n2=ler.nextDouble();
			soma=n1+n2;
			System.out.println("O resultado da soma é: "+soma);
	
			Scanner t = new Scanner(System.in);
			System.out.print("Digite S para repetir: ");
			resp=t.nextLine();
			
		}while(resp=="s"||resp=="S");
		System.out.println("Não há divisão por ZERO!!! Programa finalizado");

	}

}
