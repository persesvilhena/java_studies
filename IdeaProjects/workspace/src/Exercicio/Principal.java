package Exercicio;

public class Principal {

	public static void main(String[] args) {
		Termo ter0 = new Termo(10, 3);
		Termo ter01 = new Termo(10, 2);
		Termo ter02 = new Termo(10, 1);
		Termo ter03 = new Termo(10, 3);
		Polinomio poli1 = new Polinomio();
		poli1.insere(ter0);
		poli1.insere(ter01);
		poli1.insere(ter02);
		poli1.insere(ter03);
		
		Termo ter = new Termo(10, 3);
		Termo ter1 = new Termo(10, 2);
		Termo ter2 = new Termo(10, 1);
		Termo ter3 = new Termo(10, 3);
		Polinomio poli = new Polinomio();
		poli.insere(ter);
		poli.insere(ter1);
		poli.insere(ter2);
		poli.insere(ter3);
		poli.fusao(poli1);
		poli.imprime();
		
		
		System.out.println(poli.calcula(10));

	}

}
