package br.com.ifet.classes;

public class Dobrar {
	private int numero;
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}
	public Dobrar Dobra (){
		numero *= 3;
		return this;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dobrar d = new Dobrar();
		d.setNumero(5);
		d.Dobra().Dobra().Dobra();
		System.out.println("o valor é " + d.getNumero());
		// TODO Auto-generated method stub

	}

}
