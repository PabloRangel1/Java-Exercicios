package br.fiap.forma;

public abstract class Forma {
	
	
	protected int cX;
	protected int cY;
	protected double raio;
	
	
	public Forma(int cX, int cY, double raio) {
		this.cX = cX;
		this.cY = cY;
		this.raio = raio;
	}
	
	public abstract double calcularArea();
	
	@Override
	public String toString() {
		String aux = " ";
		aux += "x = " + cX + "\n";
		aux += "y = " + cY + "\n";
		aux += "raio = " + raio + "\n";
		return aux;
	}
	
	
	

	public int getcX() {
		return cX;
	}

	public void setcX(int cX) {
		this.cX = cX;
	}

	public int getcY() {
		return cY;
	}

	public void setcY(int cY) {
		this.cY = cY;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	
	


	
	
	

}
