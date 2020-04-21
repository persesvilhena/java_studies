package Conta;

public class ContaPoupanca implements Conta{
	private double saldo;

	public ContaPoupanca(double saldo){
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(this.saldo > valor){
			this.saldo = this.saldo - valor;
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

}
