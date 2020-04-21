package Pessoas;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("A", "123");
		Gerente p2 = new Gerente("B", "124", "123", 1000, 10);
		Funcionario p3 = new Funcionario("C", "125", "124", 2000);
		Cliente p4 = new Cliente("D", "126", 11);
		
		CadastroPessoas cad = new CadastroPessoas();
		cad.cadastrarPesssoa(p1);
		cad.cadastrarPesssoa(p2);
		cad.cadastrarPesssoa(p3);
		cad.cadastrarPesssoa(p4);
		cad.mostraCadastro();

	}

}
