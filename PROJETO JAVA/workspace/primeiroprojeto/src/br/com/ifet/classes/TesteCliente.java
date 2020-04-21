package br.com.ifet.classes;

public class TesteCliente {
	public static void main(String[] args) {
		ClienteFisico clif = new ClienteFisico("Nometeste","sobrenometeste","ruateste",15,"bairroteste","cidadeteste","estadoteste","celteste","emailteste","cpfteste","rgteste","nomepaiteste");
		clif.imprime();
		ClienteJuridico clij = new ClienteJuridico("Nometeste","sobrenometeste","ruateste",15,"bairroteste","cidadeteste","estadoteste","celteste","emailteste","cnpjteste","ieteste");
		clij.imprimir();
	}

}
