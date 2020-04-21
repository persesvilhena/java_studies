package principal;

public class Principal {
	public static void main(String[] args) {
		Circulo circ = new Circulo(5);
		System.out.println(circ.getLado());
		System.out.println(circ.area());
		//Triangulo tri new Triangulo(3,4);
		FormaGeometrica forma = new Circulo(2);
		System.out.println(forma.getLado());
		System.out.println(forma.area());
		
	}

}
