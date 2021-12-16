package PooIntrodução;


public class ExemploCaneta {

	public static void main(String[] args) {
	
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		
		c1.setCor("Verde");
		
		System.out.println(c1.getCor());
				
		c2.setCor("Roxo");		
		
		System.out.println(c2.getCor());
	}

}
