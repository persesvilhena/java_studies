package br.com.ifet.classes;

import java.io.*;

public class AtualizaArquivo {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream
		("C:\\Users\\12131001101\\Desktop\\saida.txt", true);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.newLine();
		bw.write("ket 50 centavo");
		bw.close();

	}

}
