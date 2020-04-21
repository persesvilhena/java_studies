package Exercicio;

public class Termo {
	private float a;
	private int i;
	public Termo(float a, int i) {
		super();
		this.a = a;
		this.i = i;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void Substitui(Termo obj){
		this.a = obj.a;
		this.i = obj.i;
	}
	public float Calcula(int x){
		return (float) (Math.pow(x, this.i) * this.a);
	}

	@Override
	public String toString() {
		return "Termo [a=" + a + ", i=" + i + "]";
	}
	
	
	

}
