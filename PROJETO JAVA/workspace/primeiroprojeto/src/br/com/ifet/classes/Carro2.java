package br.com.ifet.classes;

public class Carro2 {
	private String nome;
	private String marca;
	private int ano;
	private String cor;
	private double valor;
	public void setNome(String n){
		this.nome = n;
	}
	public void setMarca(String m){
		this.marca = m;
	}
	public void setCor(String c){
		this.cor = c;
	}
	public void setAno(int a){
		this.ano = a;
	}
	public void setValor(double v){
		this.valor = v;
	}
	public String getNome(){
		return this.nome;
	}
	public String getMarca(){
		return this.marca;
	}
	public String getCor(){
		return this.cor;
	}
	public int getAno(){
		return this.ano;
	}
	public double getValor(){
		return this.valor;
	}
	public void imprimir(){
		System.out.println("Nome: " + nome);
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Valor: " + valor);
	}

}
