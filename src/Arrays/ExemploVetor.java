package Arrays;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		int vet[] = new int[5];
		int soma=0, x;
		Scanner ler = new Scanner(System.in);
		
		for (x=0;x<5;x++)
		{
			System.out.println("Digite um numero");			
			vet[x]=ler.nextInt();
			soma+=vet[x];//soma= soma+vet[x];
		}
		
		for(x=0;x<5;x++)
		{
			System.out.print(vet[x]+"\t");
		}
			
		System.out.println("A soma do vetor é: "+ soma);

	}

}
