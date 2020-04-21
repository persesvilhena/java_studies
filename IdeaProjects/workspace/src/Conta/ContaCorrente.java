package Conta;

public class ContaCorrente implements Conta{
	private double saldo;
	private double taxa;
	
	public ContaCorrente(double saldo){
		this.saldo = saldo;
		this.taxa = 0.1;
	}

	@Override
	public void sacar(double valor) {
		if(this.saldo > valor + this.taxa){
			this.saldo = this.saldo - (valor + this.taxa);
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

}
