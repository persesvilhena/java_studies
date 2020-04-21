package br.com.ifet.classes;

public class Soma {
	private int x;
	private int y;
	public void somaX (int x) {
		this.x += x;
	}
	public void somaY (int y) {
		this.y += y;
	}
	public int getSoma() {
		return this.x + this.y;
	}
	public static void main(String[] args) {
		Soma s = new Soma ();
		s.somaX(100);
		s.somaY(50);
		s.somaX(35);
		s.somaY(25);
		System.out.println("Soma: " + s.getSoma());
	}

}
