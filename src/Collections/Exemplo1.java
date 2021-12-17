package Collections;

import java.util.*;

public class Exemplo1 {

	public static void main(String[] args) {
		
		String a1 = "Bloco - I";
		String a2 = "Bloco - II";
		String a3 = "Bloco - III";
		
		ArrayList<String> aula = new ArrayList<>();
		
		System.out.println(aula);
		
		System.out.println(aula.size());
		
		aula.add(a3);
		aula.add(a1);
		aula.add(a2);
		aula.add("Feira de Empregabilidade");
		
		System.out.println(aula);
		
		System.out.println(aula.size());
		
		
		aula.remove(2);
		
		System.out.println(aula);
		
		System.out.println(aula.get(2));
		
		System.out.println(aula.size());
		
		Collections.sort(aula);
		
		System.out.println(aula);
		
	}

}
