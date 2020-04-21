package Pessoas;

public class CadastroPessoas {
	private Pessoa vetor[];
	private int qtde;
	
	public CadastroPessoas(){
		this.vetor = new Pessoa[100];
		this.qtde = 0;
		
	}
	
	public void cadastrarPesssoa(Pessoa p){
		vetor[qtde] = p;
		qtde++;
	}
	
	public void mostraCadastro(){
		for(int i = 0; i < this.qtde; i++){
			vetor[i].mostrarDados();
		}
	}

}
