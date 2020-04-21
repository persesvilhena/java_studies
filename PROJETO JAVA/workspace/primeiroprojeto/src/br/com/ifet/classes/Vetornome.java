package br.com.ifet.classes;

import java.util.Arrays;

public class Vetornome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		String[] nome = new String[6];
		nome[0] = "Fabiana";
		nome[1] = "Ana";
		nome[2] = "Maria";
		nome[3] = "Renata";
		nome[4] = "Érika";
		nome[5] = "Núbia";
		for(i = 0; i<nome.length; i++){
			System.out.println(nome[i]);
		}
		
		String[] nomes = {"Fabiana","Ana","Maria","Renata","Érika","Núbia"};
		System.out.println("\n\n");
		for(i = 0; i<nomes.length; i++){
		System.out.println(nomes[i]);
		}
		
		String[] teste = new String[]{"Rodrigo","Rafael","Rodolfo","Raissa","Renan","Ronaldo"};
		System.out.println("Tamanho do vetor: " + teste.length);
		for(i = 0; i<teste.length;i++){
			System.out.println("Nome na posicao: "+i+"do vetor é: "+ teste[i]);
		}
		Arrays.sort(teste); //ordem alfabetica
		System.out.println("Agora ordenado");
		for(i = 0; i<teste.length;i++){
			System.out.println("Nome na posicao"+i+"do vetor é "+ teste[i]);
		}
		
		int[] numeros1 = new int[]{3,4,5,6,5,4,3,2,1,6};
		int[] numeros2 = new int[]{3,4,5,6,5,4,3,2,1,6};
		int[] soma = new int[10];
		for(i=0; i<numeros1.length; i++){
			soma[i] = numeros1[i] + numeros2[i];
		}
		for(i=0; i<soma.length;i++){
			System.out.println("Valor: "+ soma[i]);
		}

	}

}
