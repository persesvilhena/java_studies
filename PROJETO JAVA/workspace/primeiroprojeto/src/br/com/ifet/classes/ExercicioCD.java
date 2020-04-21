package br.com.ifet.classes;

public class ExercicioCD {
	private String nome;
	private String artista;
	private int numerodefaixas;
	private int ano;
	private int cod;
	private double preco;
	public void setNome(String no){
		this.nome = no;
	}
	public void setArtista(String ar){
		this.artista = ar;
	}
	public void setNumerodefaixas(int nu){
		this.numerodefaixas = nu;
	}
	public void setAno(int an){
		this.ano = an;
	}
	public void setCod(int co){
		this.cod = co;
	}
	public void setPreco(double pr){
		this.preco = pr;
	}
	public String getNome(){
		return this.nome;
	}
	public String getArtista(){
		return this.artista;
	}
	public int getNumerodefaixas(){
		return this.numerodefaixas;
	}
	public int getAno(){
		return this.ano;
	}
	public int getCod(){
		return this.cod;
	}
	public double getPreco(){
		return this.preco;
	}
	public ExercicioCD(){		
	}
	public ExercicioCD(String no, String ar, int nu, int an, int co, double pr){
		nome = no;
		artista = ar;
		numerodefaixas = nu;
		ano = an;
		cod = co;
		preco = pr;
	}
	public void imprimir(){
		System.out.println("Nome: " + nome);
		System.out.println("Artista: " + artista);
		System.out.println("Numero De Faixas: " + numerodefaixas);
		System.out.println("Ano: " + ano);
		System.out.println("Codigo: " + cod);
		System.out.println("Preco: " + preco);
	}

}
