package Duvidas;

import java.util.Scanner;

public class AulaDuvidas {

	public static void main(String[] args) {
		
		double n1, n2;
		
		Scanner ler = new Scanner(System.in);
		
		Calculadora c1 = new Calculadora();
		CalculadoraCientifica c2 = new CalculadoraCientifica();
		
		System.out.println("Digite o primeiro valor");
		n1=ler.nextDouble();
		System.out.println("Digite o segundo valor");
		n2=ler.nextDouble();
		
		
		System.out.println(c1.soma(n1, n2)); 
		
		System.out.println(c2.mult(n1, n2));
		

	}

}
