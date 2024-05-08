package br.fiap.forma;

public class Cilindro extends Forma{

	private double altura;
	
	public Cilindro(int cordX, int cordY, double raio) {
		super(cordX, cordY, raio);
		this.altura = altura;
	}
	
	public double calcularVolume() {
		return Math.PI * raio * raio * altura;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "altura = " + altura + "\n";
		return aux;
	}
	
	public double calcularArea() {
		return 2*Math.PI * raio * (raio+altura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



}
