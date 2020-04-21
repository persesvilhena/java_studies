package TiposGenreicos;

public class MetodosGenericos {
	/*public static void imprime(Integer entrada[]){
		for (Integer inteiro : entrada) {
			System.out.println(inteiro);
			
		}
	}
	
	public static void imprime(Double entrada[]){
		for (Double real : entrada) {
			System.out.println(real);
			
		}
	}
	
	public static void imprime(String entrada[]){
		for (String string : entrada) {
			System.out.println(string);
			
		}
	}*/
	
	public static <E> void imprime(E entrada[]){
		for (E valor : entrada) {
			System.out.println(valor);
			
		}
	}
	
	public static <E extends Comparable<E>> E maior(E obj1, E obj2){
		E m;
		if(obj1.compareTo(obj2) >= 0){
			m = obj1;
		}else{
			m = obj2;
		}
		return m;
	}
	
	public static void main(String[] args) {
		Integer vetorI[] = {1,2,3};
		String vetorS[] = {"a", "b", "c"};
		Double vetorD[] = {1.0, 2.0, 3.0};
		
		Aluno aluno = new Aluno("b", 1);
		Aluno aluno2 = new Aluno("a", 2);
		
		//Aluno vetorA[] = {aluno, aluno2};
		
		imprime(vetorI);
		imprime(vetorD);
		imprime(vetorS);
		//imprime(vetorA);
		System.out.println(maior(aluno, aluno2));
		
	}

}
