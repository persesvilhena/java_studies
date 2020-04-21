package Hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Fulano", 450);
		Aluno a2 = new Aluno("Ciclano", 123);
		Map<String, Aluno> mapa = new HashMap<String, Aluno>();
		mapa.put("Mestrado", a1);
		mapa.put("Graduacao", a2);
		System.out.println(mapa);
		Aluno aluno = mapa.get("Mestrado");
		System.out.println(aluno);
		Aluno aluno2 = mapa.get("Graduacao");
		System.out.println(aluno2);
		Set<String> conjunto = mapa.keySet();
		System.out.println(conjunto);
		Collection<Aluno> colecao = mapa.values();
		System.out.println(colecao);
		
	}

}
