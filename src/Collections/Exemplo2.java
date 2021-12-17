package Collections;

import java.util.*;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Exemplo2Aula a1 = new Exemplo2Aula("Laços",50);
		Exemplo2Aula a2 = new Exemplo2Aula("Herança",35);
		Exemplo2Aula a3 = new Exemplo2Aula("Polimorfismo",120);
		
		ArrayList<Exemplo2Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
	}

}
