package aula11;

public class No <N> {
	private N valor;
	private No<N> prox;
	
	public No(N valor) {
		this.valor = valor;
		this.prox = null;
	}
	
	public No() {
	}

	public N getValor() {
		return valor;
	}

	public void setValor(N valor) {
		this.valor = valor;
	}

	public No<N> getProx() {
		return prox;
	}

	public void setProx(No<N> prox) {
		this.prox = prox;
	}
}
