package br.com.ifet.classes;
public class TesteExercicioCD {
	public static void main(String[] args) {
		ExercicioCD ex = new ExercicioCD();
		ex.setNome("Powerslave");
		ex.setArtista("Iron Maiden");
		ex.setCod(000005);
		ex.setAno(1984);
		ex.setNumerodefaixas(8);
		ex.setPreco(25.5);
		ex.imprimir();
		ExercicioCD ex2 = new ExercicioCD("Iron Maiden", "Iron Maiden", 10, 1980, 000001, 32.5);
		ex2.imprimir();
		

	}

}
