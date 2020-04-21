package br.com.ifet.classes;

import javax.swing.JOptionPane;

public class TesteCD {
	public static void main(String[] args) {
	CD c = new CD();
	
	String nome = JOptionPane.showInputDialog(null, "Nome do album: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
	c.setNome(nome);
	String artista = JOptionPane.showInputDialog(null, "Artista: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
	c.setArtista(artista);
	int numerofaixas = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de faixas do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
	c.setNumerodefaixas(numerofaixas);
	int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
	c.setAno(ano);
	int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
	c.setCod(cod);
	double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preco: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
	c.setPreco(preco);
	
	c.imprimir();

	}

}
