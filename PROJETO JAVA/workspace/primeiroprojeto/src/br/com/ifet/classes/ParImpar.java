package br.com.ifet.classes;

public class ParImpar {
	private int numero = 0;
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public String definir() {
		int mod = numero % 2 ;
		if (mod == 0){
			return("Par");
		}else{
			return("Impar");
		}
	}
	
	public String definir2() {
		int mod = numero % 2 ;
		return(mod==0?"Par":"Impar");
	}

}
