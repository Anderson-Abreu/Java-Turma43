package Introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double cc,cf,dist,imp;
		Scanner calc = new Scanner(System.in);
		System.out.println("digite o custo de fabrica: ");
		cf=calc.nextDouble();
		dist=cf*0.28;
		imp=cf*0.45;
		cc=cf+dist+imp;
		System.out.println(cc);
	}

}
