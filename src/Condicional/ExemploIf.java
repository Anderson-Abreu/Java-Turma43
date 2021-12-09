/*
e  --> &&
ou --> ||
*/


package Condicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		int n1=5;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Digite um numero: ");
		n1=ler.nextInt();
		if(n1==5)
		{
			System.out.println("O numero é igual a 5");
		}
		else if(n1<5)
		{	
			System.out.println("Número menor que 5");
		}
		else
		{
			System.out.println("Número maior que 5");
		}
		
	
	}

}
