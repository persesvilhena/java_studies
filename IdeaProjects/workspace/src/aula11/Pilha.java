package aula11;

public class Pilha <N> {
	private No<N> topo;
	
	public Pilha() {
		this.topo = null;
	}

	public void empilha(N valor) {
		No<N> no = new No<N>(valor);
		
		if (!isEmpty())
			no.setProx(this.topo);
		
		this.topo = no;
	}
	
	public No<N> desempilha() throws PilhaVaziaException {
		No<N> aux = this.topo;
		if (!isEmpty()) {
			this.topo = this.topo.getProx();
		}else{
			throw new PilhaVaziaException();
		}
		return aux;
	}
	
	@Override
	public String toString() {
		String str = "";
		No<N> aux = this.topo;
		
		if (isEmpty())
			str = "Pilha vazia!";
		else {
			str = "Pilha: \n";
			while (aux != null) {
				str = str + aux.getValor() + "\n";
				aux = aux.getProx();
			}
		}
		
		return str;
	}
	
	public boolean isEmpty() {
		if (this.topo == null) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		Pilha<Object> p = new Pilha<>();
		try {
			p.desempilha();
		} catch (PilhaVaziaException e) {
			e.printStackTrace();
		}
		p.empilha("gay");
		p.empilha("eh");
		p.empilha("coco");
		System.out.println(p);

		Object v = null;
		try {
			v = p.desempilha().getValor();
			System.out.println("Removeu: " + v);
		} catch (PilhaVaziaException e) {
			e.printStackTrace();
		}

		System.out.println(p);
		try {
			p.desempilha();
		} catch (PilhaVaziaException e) {
			e.printStackTrace();
		}
		try {
			p.desempilha();
		} catch (PilhaVaziaException e) {
			e.printStackTrace();
		}
		System.out.println(p);
	}                 
}
