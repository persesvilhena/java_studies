package Excecoes;
import Excecoes.ContaInexistenteException;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	List<Conta> listaContas;

	public Cadastro() {
		this.listaContas = new ArrayList<Conta>();
	}

	public void add(Conta conta) {
		this.listaContas.add(conta);
	}

	public Conta get(String numero) throws ContaInexistenteException{
		Conta conta = null;
		for (Conta c : this.listaContas) {
			if (c.getNumero().equals(numero))
				conta = c;
		}
		throw new ContaInexistenteException();
	}

	public Conta debitar(String numero, double valor) throws SaldoInsuficienteException,ContaInexistenteException {
		Conta conta = get(numero);
		if (conta != null)
			conta.debitar(valor);
		return conta;
	}

}
