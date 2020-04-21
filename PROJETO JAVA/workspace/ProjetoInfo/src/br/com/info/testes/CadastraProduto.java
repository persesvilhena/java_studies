package br.com.info.testes;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.info.bean.ProdutoBean;
import br.com.info.dao.ProdutoDao;

public class CadastraProduto {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		int opcao=0;
		do{
			String opcoes = "Digite:\n1 - Cadastrar\n2 - Alterar\n3 - Excluir\n4 - Consultar\n5 - Sair";
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes, "Escolha a opcao", JOptionPane.PLAIN_MESSAGE));
			ProdutoBean produto = new ProdutoBean();
			ProdutoDao cadastrar = new ProdutoDao();
			if (opcao == 1){
				String nome = JOptionPane.showInputDialog(null, "Qual é seu nome: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setNome(nome);
				String descricao = JOptionPane.showInputDialog(null, "Qual é a descricao: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setDescricao(descricao);
				String fornecedor = JOptionPane.showInputDialog(null, "Qual é o fornecedor: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setFornecedor(fornecedor);
				Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco de compra: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPrecocompra(valor);
				Double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco de venda: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPrecovenda(valor2);
				cadastrar.cadastrarProduto(produto);
			}
			if (opcao == 2){
				int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o codigo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCodigo(cod);
				String nome = JOptionPane.showInputDialog(null, "Qual é seu nome: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setNome(nome);
				String descricao = JOptionPane.showInputDialog(null, "Qual é a descricao: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setDescricao(descricao);
				String fornecedor = JOptionPane.showInputDialog(null, "Qual é o fornecedor: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setFornecedor(fornecedor);
				Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco de compra: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPrecocompra(valor);
				Double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco de venda: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPrecovenda(valor2);
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
				JOptionPane.showMessageDialog(null, produto.getCodigo() +"\n"+ produto.getNome() +"\n"+ produto.getDescricao() +"\n"+ produto.getFornecedor() +"\n"+ produto.getPrecocompra() +"\n"+ produto.getPrecovenda());
				System.out.println(produto.getCodigo());
				System.out.println(produto.getNome());
				System.out.println(produto.getDescricao());
				System.out.println(produto.getFornecedor());
				System.out.println(produto.getPrecocompra());
				System.out.println(produto.getPrecovenda());
				
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
