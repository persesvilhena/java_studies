package principal;

public abstract class FormaGeometrica {
	private int lado;
	
	public int getLado(){
		return lado;
	}
	
	public void setLado(int lado){
		if(lado > 0){
			this.lado = lado;
		}
	}
	
	public void imprime(){
		System.out.println("Numero de lados: " + this.lado);
	}
	
	public abstract double area();

}
