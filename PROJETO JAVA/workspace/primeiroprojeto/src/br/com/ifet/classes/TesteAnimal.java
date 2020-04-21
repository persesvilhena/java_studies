package br.com.ifet.classes;
public class TesteAnimal {
	public static void main(String[] args) {
		Animal an = new Animal();
		an.setNome("georg");
		an.setEspecie("macaco");
		an.setDono("elvis");
		an.setPatas(4);
		an.setPeso(14.5);
		an.imprimir();
		Animal an2 = new Animal("no","es","do",5,45.6);
		an2.imprimir();
		


	}

}
