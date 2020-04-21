package Empregado;

public class PorHora extends Empregado{
	private double valor;
	public PorHora(String nome, double valor, double hora) {
		super(nome);
		this.valor = valor;
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "PorHora, Nome: " + super.getNome() + 
				" [valor=" + valor + ", hora=" + hora + ", ganha()="
				+ ganha() + "]";
	}
	private double hora;
	@Override
	public double ganha() {
		// TODO Auto-generated method stub
		return this.valor * this.hora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	
	

}
