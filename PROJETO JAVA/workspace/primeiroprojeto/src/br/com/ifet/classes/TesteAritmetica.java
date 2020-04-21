package br.com.ifet.classes;

public class TesteAritmetica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aritmetica a = new Aritmetica();
		a.n1 = 3;
		a.n2 = 3;
		System.out.println(a.soma());
		System.out.println(a.subtrai());
		System.out.println(a.multiplica());
		System.out.println(a.divide());

	}

}
