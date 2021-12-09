package Condicional;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		String x;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digte uma letra: ");
		x=ler.nextLine();
		
		switch(x)
		{
		case "a":
			System.out.println("Vogal");
			break;
		case "e":
			System.out.println("Vogal");
			break;
		case "i":
			System.out.println("Vogal");
			break;
		case "o":
			System.out.println("Vogal");
			break;
		case "u":
			System.out.println("vogal");
			break;
		default:
			System.out.println("consoante");
		}

	}

}
