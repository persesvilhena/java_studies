package br.com.ifet.classes;

import java.io.*;

public class LerArquivo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String arquivo = "C:\\Users\\12131001101\\Desktop\\saida.txt";
		InputStream is = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s =br.readLine();
		while(s != null){
			System.out.println(s);
			s = br.readLine();
		}

	}

}
