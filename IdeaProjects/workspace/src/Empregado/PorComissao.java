package Empregado;

public class PorComissao extends Empregado{
	private double salario;
	private double comissao;
	private int venda;
	@Override
	public double ganha() {
		// TODO Auto-generated method stub
		return (this.salario + (this.comissao * this.venda));
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public int getVenda() {
		return venda;
	}
	public void setVenda(int venda) {
		this.venda = venda;
	}
	@Override
	public String toString() {
		return "PorComissao, Nome: " + super.getNome() + 
				" [salario=" + salario + ", comissao=" + comissao
				+ ", venda=" + venda + ", ganha=" + ganha() + "]";
	}
	public PorComissao(String nome, double salario, double comissao, int venda) {
		super(nome);
		this.salario = salario;
		this.comissao = comissao;
		this.venda = venda;
	}


	

}
