package Exceptions;


import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		int n1,n2,div;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		n1=ler.nextInt();
		System.out.print("\nDigite o segundo número: ");
		n2=ler.nextInt();
		
		try {	
		div=n1/n2;	
		System.out.println("\nO resultado da divisão é: "+ div);	
		}catch (ArithmeticException e) {
			System.out.println("Erro não é possível a divisão por Zero!");
			e.printStackTrace();
		}
		
	}

}
