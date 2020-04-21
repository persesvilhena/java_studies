package Exercicio;

public class Polinomio implements Calculavel{
	private int qtde;
	private Termo termos[];

	public Polinomio() {
		super();
		this.termos = new Termo[10];
	}

	@Override
	public void insere(Termo termoInserido) {
		int i=0;
			for(i=0; i<qtde; i++){
				if(termos[i].getI() == termoInserido.getI()){
					float valorA;
					valorA = termos[i].getA() + termoInserido.getA();
					termos[i].setA(valorA);
					break;
				}
			}
			if(qtde == i){
				this.termos[qtde] = termoInserido;
				qtde++;
			}
		
	}

	@Override
	public float calcula(int x) {
		float valor = 0;
		for(int i=0; i<qtde; i++){
			valor = valor + (termos[i].Calcula(x));
		}
		return valor;
	}
	
	public void imprime(){
		for(int i=0; i<qtde; i++){
			System.out.println(i + ": " + termos[i].toString());
		}
	}
	
	public void fusao(Polinomio poli){
		for(int i=0; i<poli.qtde; i++){
			this.insere(poli.termos[i]);
		}
	}
	

}
