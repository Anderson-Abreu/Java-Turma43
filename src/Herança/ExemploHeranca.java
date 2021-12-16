package Herança;

public class ExemploHeranca {

	public static void main(String[] args) {
		Professor p = new Professor();
		Aluno a = new Aluno();
		
		p.setNome("Yuri");
		p.setIdade(22);
		p.corrigirProva();
		p.aniversario();

		a.setNome("Anderson");
		a.setMedia(8.50);
		
		
		
		System.out.println(a.getNome()+" "+a.getMedia());
	}

}
