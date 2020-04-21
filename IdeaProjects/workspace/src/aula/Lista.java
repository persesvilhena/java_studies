package aula;


import java.util.List;
import java.util.Vector;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayLista <Integer> lista = new ArrayList<>();
		//List<Integer> lista = new ArrayList<>();
		
		//Vector<Integer> lista = new Vector<>();
		List<Integer> lista = new Vector<>();
		lista.add(10);
		lista.add(12);
		lista.add(-7);
		//lista.remove(1);
		
		lista.remove(new Integer(12));
		System.out.println(lista);

	}

}
