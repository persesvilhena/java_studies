package br.com.ifet.classes;

public class TestePaciente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Paciente pa = new Paciente();
		pa.setNome("testenome");
		pa.setEndereco("testeendereco");
		pa.setCidade("testecidade");
		pa.setIdade(80);
		pa.imprimir();


	}

}
