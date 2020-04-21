package Conta;

public class Principal {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(1000);
		Conta c2 = new ContaCorrente(2000);
		c1.sacar(25);
		c2.sacar(250);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		Conta c3 = new ContaPoupanca(1000);
		Conta c4 = new ContaPoupanca(2000);
		c3.sacar(25);
		c4.sacar(250);
		System.out.println(c3.getSaldo());
		System.out.println(c4.getSaldo());
		
		
	}

}
