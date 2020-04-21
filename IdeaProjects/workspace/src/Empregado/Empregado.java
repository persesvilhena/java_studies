package Empregado;

public abstract class Empregado {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public abstract double ganha();
	
	public String toString(){
		return ("Nome: " + this.nome);
	}

	public Empregado(String nome) {
		super();
		this.nome = nome;
	}
	

}
