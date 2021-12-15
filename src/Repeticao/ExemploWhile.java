package Repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		double n1,n2;
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Digite o numero que sera dividido:");
		n1=ler.nextDouble();
		System.out.println("Digite onumero que ira dividir ");
		n2=ler.nextDouble();
		while(n2!=0)
		{
			System.out.println("O resultado da divisão é: "+n1/n2);
			System.out.println("Digite o numero que sera dividido:");
			n1=ler.nextDouble();
			System.out.println("Digite onumero que ira dividir ");
			n2=ler.nextDouble();
			
		}
		System.out.println("Não há divisão por ZERO!!! Programa finalizado");
	}

}
