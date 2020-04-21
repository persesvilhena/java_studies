package br.com.ifet.classes;

public class Atribuicao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		
		x+=y;
		System.out.println("x+=y vale" + x);
		x*=y;
		System.out.println("x*=y vale" + x);
		x-=y;
		System.out.println("x-=y vale" + x);
		x/=y;
		System.out.println("x/=y vale " +x + " teste");
		
		x=10;
		System.out.println(x++ + 2);
		System.out.println(x);
		
		x=10;
		System.out.println(x + 2);
		x=x+1;
		
		System.out.println(++x + 2);
		System.out.println(x);

	}

}
