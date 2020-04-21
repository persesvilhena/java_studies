package br.com.ifet.classes;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("Numero de alunos: " + Aluno.numeroDeAlunos);
		Aluno a1 = new Aluno("Rodrigo",000001);
		a1.mostra();
		Aluno a2 = new Aluno("Pedro",000002);
		a2.mostra();
		System.out.println("Numero de alunos: " + Aluno.getNumeroDeAluno());
		Aluno a3 = new Aluno("Thais",000003);
		System.out.println("Numero de alunos: " + Aluno.getNumeroDeAluno());
		Aluno a4 = new Aluno();
		a4.setNome("Fernanda");
		a4.setNumeroBI(000004);
		System.out.println("Numero de alunos: " + Aluno.getNumeroDeAluno());
		a1=null;
		System.out.println(a3.getNome());
		System.out.println("Numero de alunos: " + Aluno.getNumeroDeAluno());

	}

}
