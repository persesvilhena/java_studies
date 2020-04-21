package TiposGenreicos;

public class Par <A, B> {
	private A primeiro;
	private B segundo;
	
	public Par(A primeiro, B segundo){
		this.primeiro = primeiro;
		this.segundo = segundo;
		
	}

	public A getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(A primeiro) {
		this.primeiro = primeiro;
	}

	public B getSegundo() {
		return segundo;
	}

	public void setSegundo(B segundo) {
		this.segundo = segundo;
	}

	@Override
	public String toString() {
		return "Par [primeiro=" + primeiro + ", segundo=" + segundo + "]";
	}
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno("b", 1);
		Par<Aluno, Double> p = new Par<>(aluno, 10.0);
		
		System.out.println(p);
		
		Pessoa pessoa = new Pessoa("Aline", "123456789");
		Par<Pessoa, String> p2 = new Par<>(pessoa,"Muzambinho");
		System.out.println(p2);
		
		
	}

}
