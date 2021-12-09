package Introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int total, anos, meses, dias;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite sua idade em dias: ");
		total=calc.nextInt();
		anos=total/365;
		meses=(total%365)/30;
		dias=total-anos*365-meses*30;
		System.out.println("você tem "+anos+" anos "+meses+" meses e "+dias+" dias de nascido");
		calc.close();
	}

}
