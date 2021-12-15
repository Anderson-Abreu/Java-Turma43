package LacoRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int idade=0, sexo, sentir, fn=0, oc=0, pc=0, ha=0,cont=0,jc=0, vn=0;
		Scanner ler = new Scanner(System.in);
		while(cont<15)
		{
			System.out.println("Digite sua idade: ");
			idade=ler.nextInt();
			System.out.println("Qual seu sexo?\n1-feminino\n2-masculino\n3-outros: ");
			sexo=ler.nextInt();
			System.out.println("Escolha a opção que melhor representa como você esta se sentindo");
			System.out.println("1-calmo\n2-nervoso\n3-agressivo");
			sentir=ler.nextInt();
			
			if(sentir==1)
				pc++;
			if(sexo==1 && sentir==2)
				fn++;
			if(sexo==2 && sentir==3)
				ha++;
			if(sexo==3 && sentir==1)
				oc++;
			if(idade>40 && sentir==2)
				vn++;
			if(idade<18 && sentir==1)
				jc++;
			
			cont++;
		}
		System.out.println("O número de pessoas calmas é "+pc);
		System.out.println("O número de mulheres nervosas é "+ fn);
		System.out.println("O número de homens agressivos é "+ ha);
		System.out.println("O número de outros calmos é "+ oc);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é "+vn);
		System.out.println("O número de pessoas calmas com menos de 18 anos é "+ jc);
	}
}
