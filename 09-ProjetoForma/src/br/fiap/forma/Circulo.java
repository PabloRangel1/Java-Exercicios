package br.fiap.forma;

public class Circulo extends Forma {

	public Circulo(int cordX, int cordY, double raio) {
		super(cordX, cordY, raio);
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
	
	
	
	
}


