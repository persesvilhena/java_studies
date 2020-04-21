package br.com.info.bean;

public class ProdutoBean {
	private int codigo;
	private String nome;
	private String descricao;
	private String fornecedor;
	private double precocompra;
	private double precovenda;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor){
		this.fornecedor = fornecedor;
	}
	public double getPrecocompra() {
		return precocompra;
	}
	public void setPrecocompra(double precocompra){
		this.precocompra = precocompra;
	}
	public double getPrecovenda() {
		return precovenda;
	}
	public void setPrecovenda(double precovenda){
		this.precovenda = precovenda;
	}

}
