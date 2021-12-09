package Introducao;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double x1,y1,x2,y2,d;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite as coordenadas do ponto de partida: ");
		x1=calc.nextDouble();
		y1=calc.nextDouble();
		System.out.print("Digite as coordenadas do ponto de destino: ");
		x2=calc.nextDouble();
		y2=calc.nextDouble();
		d=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println(d);
	}

}
