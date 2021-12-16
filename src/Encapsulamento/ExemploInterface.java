package Encapsulamento;

public class ExemploInterface {

	public static void main(String[] args) {
		Controle tv = new Controle();
		
		tv.ligar();
		tv.canalUp();
		tv.maisVol();
		tv.menosVol();
		tv.canalDown();
		
		tv.status();

	}

}
