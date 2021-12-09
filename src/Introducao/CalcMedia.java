package Introducao;

import java.util.Scanner;

public class CalcMedia {

	public static void main(String[] args) {
		int n1, n2, media;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		n1=ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2=ler.nextInt();
		media=(n1+n2)/2;
		System.out.println("A média é:"+media);
		ler.close();
	}

}
