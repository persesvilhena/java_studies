package aula;

import java.util.Arrays;

public class Veores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vetor[] = {"a", "b", "c", "d", "e"};
		
		String s = Arrays.toString(vetor);
		System.out.println(s);
		
		String vetorCopia[] = Arrays.copyOf(vetor, 5);
		System.out.println(Arrays.toString(vetorCopia));
		
		String vetorRange[] = Arrays.copyOfRange(vetor, 0, 3);
		System.out.println(Arrays.toString(vetorRange));
		
		int vetorFill[] = new int[10];
		Arrays.fill(vetorFill, 2);
		System.out.println(Arrays.toString(vetorFill));
		
		Arrays.sort(vetor);
		System.out.println(Arrays.toString(vetor));
		
		int busca = Arrays.binarySearch(vetor, "c");
		System.out.println(busca);
		
		boolean igual = Arrays.equals(vetor, vetorCopia);
		System.out.println(igual);
		
		

	}

}
