package Introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int h, m, s, t;
		Scanner tempo = new Scanner(System.in);
		System.out.print("Digite o tempo de duração do evento em segundos: ");
		t=tempo.nextInt();
		h=t/3600;
		m=t%3600/60;
		s=t-h*3600-m*60;
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);

	}

}
