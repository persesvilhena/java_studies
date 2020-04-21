package br.com.ifet.classes;

public class TesteCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro car = new Carro();
		car.nome = "nomedocarro";
		car.marca = "marcadocarro";
		car.ano = 1999;
		car.cor = "cordocarro";
		car.valor = 10000.00;
		car.imprimir();

	}

}
