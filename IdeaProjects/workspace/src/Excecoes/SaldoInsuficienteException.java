package Excecoes;
public class SaldoInsuficienteException extends Exception {
	private Conta c;

	public SaldoInsuficienteException() {
		super("Saldo Insuficiente");
		this.c = c;
	}
	public Conta getConta(){
		return c;
	}

}
