package Duvidas;

public class Calculadora implements InterCalc {

	@Override
	public double soma(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public double sub(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		if(n2==0)
			return 0;
		else
			return n1/n2;
	}

	@Override
	public double mult(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}
	
	
}
