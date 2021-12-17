package Polimorfismo;

public abstract class Animal {
	private int peso;
	
	public void emitirSom()
	{
		System.out.println("Som de Animal");
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
