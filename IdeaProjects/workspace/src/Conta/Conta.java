package Conta;

public interface Conta {
	void sacar(double valor);
	abstract void depositar(double valor);
	public abstract double getSaldo();
	
	

}
