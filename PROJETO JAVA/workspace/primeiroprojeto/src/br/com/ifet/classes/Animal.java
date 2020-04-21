package br.com.ifet.classes;

public class Animal {
	//nome(str), especie(str), patas(i), peso(double), dono(stri), set, get, imprimir, 2construtor
	private String nome;
	private String especie;
	private int patas;
	private double peso;
	private String dono;
	public void setNome(String n){
		this.nome = n;
	}
	public void setEspecie(String e){
		this.especie = e;
	}
	public void setDono(String d){
		this.dono = d;
	}
	public void setPatas(int p){
		this.patas = p;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	public String getNome(){
		return this.nome;
	}
	public String getEspecie(){
		return this.especie;
	}
	public int getPatas(){
		return this.patas;
	}
	public String getDono(){
		return this.dono;
	}
	public double getPeso(){
		return this.peso;
	}

	public Animal(){
	}
	public Animal (String n, String e, String d, int pat, double pes){
		nome=n;
		especie=e;
		dono=d;
		patas=pat;
		peso=pes;
	}
	public void imprimir(){
		System.out.println("Nome: "+ this.nome);
		System.out.println("Especie: "+ this.especie);
		System.out.println("Dono: "+ this.dono);
		System.out.println("Patas: "+ this.patas);
		System.out.println("Peso: "+ this.peso);
	}

}
