package Exceptions;


import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		int n1,n2,div;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		n1=ler.nextInt();
		System.out.print("\nDigite o segundo n�mero: ");
		n2=ler.nextInt();
		
		try {	
		div=n1/n2;	
		System.out.println("\nO resultado da divis�o �: "+ div);	
		}catch (ArithmeticException e) {
			System.out.println("Erro n�o � poss�vel a divis�o por Zero!");
			e.printStackTrace();
		}
		
	}

}
