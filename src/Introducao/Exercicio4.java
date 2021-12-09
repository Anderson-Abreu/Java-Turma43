package Introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double a,b,c,d,r, s;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite o valor de A B C ");
		a=calc.nextDouble();
		b=calc.nextDouble();
		c=calc.nextDouble();
		s= Math.pow(b+c, 2);
		r= Math.pow(a+b, 2);
		d=(r+s)/2;
		System.out.println(r);
		System.out.println(s);
		System.out.println(d);
		calc.close();
	}

}
