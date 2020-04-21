package principal;

public abstract class Triangulo extends FormaGeometrica{
	private double base, altura;
	
	public Triangulo(double base, double altura){
		this.altura = altura;
		this.base = base;
		super.setLado(3);
	}
	
	public double getBase(){
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

}
