package Collections;

public class Exemplo2Aula {

	private String titulo;
	private int tempo;
	
	public Exemplo2Aula(String x, int n) {
		this.titulo=x;
		this.tempo=n;
	}
	
	public String toString() {
		return "Aulas: "+this.titulo+", "+this.tempo+"min";
	}

}

