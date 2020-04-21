package br.com.ifet.classes;

public class Paciente {
	private String nome;//nome, enderteco, cidade idade
	private String endereco;
	private String cidade;
	private int idade;
	public String getNome(){
		return nome;
	}
	public String getEndereco(){
		return endereco;
	}
	public String getCidade(){
		return cidade;
	}
	public int getIdade(){
		return idade;
	}
    public void setNome (String s){
    	nome=s;
    }
    public void setEndereco (String e){
    	endereco=e;
    }
    public void setCidade (String c){
    	cidade=c;
    }
    public void setIdade (int i){
    	idade=i;
    }
	public void imprimir(){
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Cidade: " + cidade);
		System.out.println("Idade: " + idade);
	}

//	public Paciente(String nome, String endereco, String cidade, int idade){
//		this.nome = nome;
//		this.endereco = endereco;
//		this.cidade = cidade;
//		this.idade = idade;
//	}

}
