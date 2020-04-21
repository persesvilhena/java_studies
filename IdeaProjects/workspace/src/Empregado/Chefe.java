package Empregado;

public class Chefe extends Empregado{
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Chefe(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	@Override
	public double ganha() {
		// TODO Auto-generated method stub
		return salario;
	}

	@Override
	public String toString() {
		return "Chefe, Nome: " + super.getNome() + 
				" [salario=" + salario + ", ganha()=" + ganha() + "]";
	}
	

}
