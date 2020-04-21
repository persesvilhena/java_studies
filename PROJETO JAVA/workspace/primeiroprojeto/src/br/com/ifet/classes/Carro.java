package br.com.ifet.classes;

public class Carro {
	public String nome;
	public String marca;
	public int ano;
	public String cor;
	public double valor;
	public void imprimir(){
		System.out.println("Nome: " + nome);
		System.out.println("Marca: " + marca);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Valor: " + valor);
	}

}
