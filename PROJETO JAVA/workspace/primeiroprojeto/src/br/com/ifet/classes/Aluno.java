package br.com.ifet.classes;

public class Aluno {
	public static int numeroDeAlunos=0;
	public static void incNumeroDeAlunos(){
		numeroDeAlunos++;
	}
	public static int getNumeroDeAluno(){
		return numeroDeAlunos;
	}
	private String nome;
	private int numeroBI;
	public Aluno(){
		nome="";
		numeroBI=0;
		incNumeroDeAlunos();
	}
	public Aluno (String s,int x){
		nome=s;
		numeroBI=x;
		incNumeroDeAlunos();
	}
	public String getNome(){
		return nome;
	}
	public int getNumeroBI(){
		return numeroBI;
	}
    public void setNome (String s){
    	nome=s;
    }
	public void setNumeroBI(int x){
		numeroBI=x;
	}
	public void mostra(){
		System.out.println("Nome do Aluno ="+nome);
		System.out.println("BI = "+numeroBI);
	}

}
