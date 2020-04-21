package Excecoes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExcecaoNaoVerificada {

	// a excecao existe, mas o java n�o obriga o tratamento.
	
	
	public static void main(String[] args) {
	//	String vetor[] = {"a", "b", "c"};
	//	System.out.println(vetor[10]);
		
		
	//	String str = null;
	//	System.out.println(str.toLowerCase());
		
	//	System.out.println(7/0);
		
		//verificada voce tem que tratar no c�digo.
		
		try {
			InputStream is = new FileInputStream("Texto.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
