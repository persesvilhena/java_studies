package Empregado;

public class PorItem extends Empregado{
	private double producao;
	private int quantidade;
	public double getProducao() {
		return producao;
	}
	public void setProducao(double producao) {
		this.producao = producao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public double ganha() {
		// TODO Auto-generated method stub
		return producao * quantidade;
	}
	public PorItem(String nome, double producao, int quantidade) {
		super(nome);
		this.producao = producao;
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "PorItem, Nome: " + super.getNome() + 
				" [producao=" + producao + ", quantidade=" + quantidade
				+ ", ganha()=" + ganha() + "]";
	}
	

}
