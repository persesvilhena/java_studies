package br.com.ifet.classes;

public class Atividade {
	float num = 0;
	int base = 0;
	int alt = 0;
	
	public void msg(){
		System.out.println("Base x Altura:");
	}
	public float dobro(){
		return num * 2;
	}
	public void msg2(){
		System.out.println("Dobro:");
	}
	public int basealt(){
		return base * alt;
	}

}
