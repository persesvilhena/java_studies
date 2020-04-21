package Fila;

public class Principal {

	public static void main(String[] args) {
		int cont;
		Pessoa p1 = new Pessoa("A", "123");
		Pessoa c1 = new Pessoa("Coquinho bahiano", "123");
		Pessoa c2 = new Pessoa("Coquinho malukis", "123");

		
		Fila cad = new Fila();
		cad.add(c1);
		for(cont=0;cont<198; cont++){
			cad.add(p1);
		}
		cad.add(c2);
		//cad.add(p1);
		//cad.add(p1);

		cad.remover();
		cad.mostraFila();


	}

}
