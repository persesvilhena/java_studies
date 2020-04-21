package br.com.janela.principal;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.janela.bean.JanelaBean;
import br.com.janela.dao.JanelaDao;

public class CadastraJanela {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		int opcao=0;
		do{
			String opcoes = "Digite:\n1 - Cadastrar\n2 - Alterar\n3 - Excluir\n4 - Consultar\n5 - Sair";
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes, "Escolha a opcao", JOptionPane.PLAIN_MESSAGE));
			JanelaBean produto = new JanelaBean();
			JanelaDao cadastrar = new JanelaDao();
			if (opcao == 1){
				double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a altura: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setAltura(altura);
				double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o comprimento: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setComprimento(comprimento);
				double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPreco(preco);
				String tipo = JOptionPane.showInputDialog(null, "Qual é o tipo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setTipo(tipo);
				int folhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Folhas: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCodigo(folhas);
				cadastrar.cadastrarProduto(produto);
			}
			if (opcao == 2){
				int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o codigo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCodigo(cod);
				double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a altura: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setAltura(altura);
				double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o comprimento: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setComprimento(comprimento);
				double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPreco(preco);
				String tipo = JOptionPane.showInputDialog(null, "Qual é o tipo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setTipo(tipo);
				int folhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Folhas: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCodigo(folhas);
				cadastrar.alterarProduto(produto);
			}
			if (opcao == 3){
				int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o codigo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCodigo(cod);
				cadastrar.excluirProduto(cod);
			}
			if (opcao == 4){
				int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o codigo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCodigo(cod);
				produto = cadastrar.consultarProduto(cod);
				JOptionPane.showMessageDialog(null, produto.getCodigo() +"\n"+ produto.getAltura() +"\n"+ produto.getComprimento() +"\n"+ produto.getPreco() +"\n"+ produto.getTipo() +"\n"+ produto.getFolhas());
				
			}
			if (opcao == 5){
				System.exit(1);
			}
		}while(opcao < 5);
		

		//produto.setNome("Quiabo");
		//produto.setDescricao("Alimentos");
		//produto.setFornecedor("Zaeli");
		//produto.setPrecocompra(5.10);
		//produto.setPrecovenda(10.00);
		
		//produto.setCodigo(1);
		//cadastrar.alterarProduto(produto);
		//cadastrar.excluirProduto(1);
		//produto = cadastrar.consultarProduto(2);
		//System.out.println(produto.getNome());
		//System.out.println(produto.getCodigo());
		//System.out.println(produto.getDescricao());
		

	}

}
