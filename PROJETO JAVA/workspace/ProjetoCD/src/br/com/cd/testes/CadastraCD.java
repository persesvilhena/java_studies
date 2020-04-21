package br.com.cd.testes;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.cd.bean.CDBean;
import br.com.cd.dao.CDDao;

public class CadastraCD {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		int opcao=0;
		do{
			String opcoes = "Digite:\n1 - Cadastrar\n2 - Alterar\n3 - Excluir\n4 - Consultar\n5 - Sair";
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, opcoes, "Escolha a opcao", JOptionPane.PLAIN_MESSAGE));
			CDBean produto = new CDBean();
			CDDao cadastrar = new CDDao();
			if (opcao == 1){
				String nome = JOptionPane.showInputDialog(null, "Qual é o nome do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setNome(nome);
				String artista = JOptionPane.showInputDialog(null, "Qual é o artista: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setArtista(artista);
				String descricao = JOptionPane.showInputDialog(null, "Descricao do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setDescricao(descricao);
				int faixas = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de faixas: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setNumerodefaixas(faixas);
				int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setAno(ano);
				Double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPreco(preco);
				cadastrar.cadastrarProduto(produto);
			}
			if (opcao == 2){
				int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o codigo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCod(cod);
				String nome = JOptionPane.showInputDialog(null, "Qual é o nome do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setNome(nome);
				String artista = JOptionPane.showInputDialog(null, "Qual é o artista: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setArtista(artista);
				String descricao = JOptionPane.showInputDialog(null, "Descricao do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
				produto.setDescricao(descricao);
				int faixas = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de faixas: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setNumerodefaixas(faixas);
				int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do cd: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setAno(ano);
				Double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o preco: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setPreco(preco);
				cadastrar.alterarProduto(produto);
			}
			if (opcao == 3){
				int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o codigo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCod(cod);
				cadastrar.excluirProduto(cod);
			}
			if (opcao == 4){
				int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o codigo: ", "Pergunta", JOptionPane.PLAIN_MESSAGE));
				produto.setCod(cod);
				produto = cadastrar.consultarProduto(cod);
				JOptionPane.showMessageDialog(null, produto.getCod() +"\n"+ produto.getNome() +"\n"+ produto.getArtista() +"\n"+ produto.getDescricao() +"\n"+ produto.getNumerodefaixas() +"\n"+ produto.getAno() +"\n"+ produto.getPreco());				
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
