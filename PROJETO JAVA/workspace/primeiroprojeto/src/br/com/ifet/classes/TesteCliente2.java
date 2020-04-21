package br.com.ifet.classes;

import javax.swing.JOptionPane;

public class TesteCliente2 {

	public static void main(String[] args) {
		ClienteFisico clif = new ClienteFisico();
		JOptionPane.showMessageDialog(null, "Teste Cliente Fisico");
		String nome = JOptionPane.showInputDialog(null, "Qual é seu nome: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setNome(nome);
		String sobrenome = JOptionPane.showInputDialog(null, "Qual é seu sobrenome: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setSobrenome(sobrenome);
		String rua = JOptionPane.showInputDialog(null, "Qual é a sua rua: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setRua(rua);
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o numero: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
		clif.setNumero(numero);
		String bairro = JOptionPane.showInputDialog(null, "Qual é seu Bairro: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setBairro(bairro);
		String cidade = JOptionPane.showInputDialog(null, "Qual é sua cidade: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setCidade(cidade);
		String estado = JOptionPane.showInputDialog(null, "Qual é seu estado: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setEstado(estado);
		String cel = JOptionPane.showInputDialog(null, "Qual é seu celular: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setCel(cel);
		String email = JOptionPane.showInputDialog(null, "Qual é seu email: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setEmail(email);
		String cpf = JOptionPane.showInputDialog(null, "Qual é seu cpf: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setCpf(cpf);
		String rg = JOptionPane.showInputDialog(null, "Qual é seu rg: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setRg(rg);
		String nomepai = JOptionPane.showInputDialog(null, "Qual é o nome do seu pai: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clif.setNomepai(nomepai);
		
		JOptionPane.showMessageDialog(null, "Teste Cliente Juridico");
		ClienteJuridico clij = new ClienteJuridico();
		String nomej = JOptionPane.showInputDialog(null, "Qual é seu nome: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setNome(nomej);
		String sobrenomej = JOptionPane.showInputDialog(null, "Qual é seu sobrenome: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setSobrenome(sobrenomej);
		String ruaj = JOptionPane.showInputDialog(null, "Qual é a sua rua: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setRua(ruaj);
		int numeroj = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o numero: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
		clij.setNumero(numeroj);
		String bairroj = JOptionPane.showInputDialog(null, "Qual é seu Bairro: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setBairro(bairroj);
		String cidadej = JOptionPane.showInputDialog(null, "Qual é sua cidade: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setCidade(cidadej);
		String estadoj = JOptionPane.showInputDialog(null, "Qual é seu estado: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setEstado(estadoj);
		String celj = JOptionPane.showInputDialog(null, "Qual é seu celular: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setCel(celj);
		String emailj = JOptionPane.showInputDialog(null, "Qual é seu email: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setEmail(emailj);
		String cnpj = JOptionPane.showInputDialog(null, "Qual é seu cnpj: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setCnpj(cnpj);
		String ie = JOptionPane.showInputDialog(null, "Qual é a Inscricao estadual: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
		clij.setIe(ie);
		
		System.out.println("Cliente Fisico");
		clif.imprime();
		System.out.println("Cliente Juridico\n");
		clij.imprimir();

	}

}
