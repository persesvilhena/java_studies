package Hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TabelaHash {
	 private int tamanho;
	 private Map<Integer, List<Integer>> m;
	 
	 public TabelaHash(int tamanho){
		 this.tamanho = tamanho;
		 
		 m = new HashMap<Integer, List<Integer>>();
		 
		 for(int x=0; x<this.tamanho; x++){
			 m.put(x, new LinkedList<Integer>());
		 }
	 }
	 
	 public int getTamanho(){
		 return tamanho;
	 }

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int f(int n){
		return n % this.getTamanho();
	}
	
	public void add(Integer numero){
		int indice = this.f(numero);
		m.get(indice).add(numero);
	
	}
	
	public void remove(Integer numero){
		int indice = this.f(numero);
		m.get(indice).remove(numero);
	}
	 
	 

}
