package Fila;

public class Fila {
	private Object vetor[];
	private int qtde;
	private int tam;
	
	public Fila(){
		this.tam = 100;
		this.vetor = new Object[tam];
		this.qtde = 0;
	}
	
	public void add(Object obj){
		if(qtde == 100){
			tam = tam + 100;
			Object vetorAux[] = new Object[tam];
			for(int i=0;i<qtde;i++){
				vetorAux[i] = vetor[i];
			}
			vetor = vetorAux;
		}
		vetor[qtde] = obj;
		qtde++;
	}
	
	public void remover(){
		vetor[0] = null;
		qtde--;
		for(int i=0;i<qtde;i++){
			vetor[i] = vetor[i + 1];
		}
	}
	
	public void mostraFila(){
		for(int i = 0; i < this.qtde; i++){
			System.out.println(i + ":  " + vetor[i].toString());
		}
	}
	

}
