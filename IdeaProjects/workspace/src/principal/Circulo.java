package principal;

public class Circulo extends FormaGeometrica{
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
		super.setLado(0);
	}
	
	public double area(){
		return Math.PI * this.raio * this.raio;
	}
	public double getRaio(){
		return raio;
	}
	
	public void setRaio(double raio){
		if(raio > 0){
			this.raio = raio;
		}
	}

}
