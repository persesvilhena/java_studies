package br.com.ifet.classes;

public class ParImparTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar npi = new ParImpar();
		npi.setNumero(10);
		String retorno = npi.definir();
		System.out.println(retorno);
		npi.setNumero(15);
		retorno = npi.definir2();
		System.out.println(retorno);

	}

}
