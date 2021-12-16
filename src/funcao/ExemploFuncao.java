package funcao;

import java.util.Scanner;

public class ExemploFuncao {

	public static void main(String[] args) {
		int x;
		x=calculo();
		imprime(x);

	}
	
	public static int calculo()
	{
		
		int soma,a,b;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite um numero");
		a=ler.nextInt();
		System.out.println("digite um numero");
		b=ler.nextInt();
		soma=a+b;
		return soma;
	}
	
	public static void imprime(int x)
	{
		System.out.println("A soma é: "+x);
		fim();
	}
	
	public static void fim()
	{
		System.out.println("\n FIM DO PROGRAMA!!!!");
	}
}
