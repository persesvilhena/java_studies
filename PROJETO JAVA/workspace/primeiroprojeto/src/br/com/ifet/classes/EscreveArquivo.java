package br.com.ifet.classes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream
		("C:\\Users\\12131001101\\Desktop\\saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Ket 10 real");
		bw.close();

	}

}
