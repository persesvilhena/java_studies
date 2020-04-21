package br.com.ifet.classes;

public class TesteAtividade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atividade x = new Atividade();
		x.alt = 10;
		x.base = 20;
		x.num = 50;
		x.msg();
		System.out.println(x.basealt());
		x.msg2();
		System.out.println(x.dobro());

	}

}
