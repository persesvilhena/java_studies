package br.com.janela.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.janela.bean.JanelaBean;
import br.com.janela.conexao.Conexao;

public class JanelaDao {
	public void cadastrarProduto(JanelaBean produto) throws SQLException, ClassNotFoundException{
		String Sql = "INSERT INTO janela (altura, comprimento, preco, tipo, folhas) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(Sql);
		comandoSql.setDouble(1, produto.getAltura());
		comandoSql.setDouble(2, produto.getComprimento());
		comandoSql.setDouble(3, produto.getPreco());
		comandoSql.setString(4, produto.getTipo());
		comandoSql.setInt(5, produto.getFolhas());
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Insercao realizada com sucesso!");
	}
	
	public void alterarProduto(JanelaBean produto) throws SQLException, ClassNotFoundException{
		String sql = "UPDATE janela SET altura = ?, comprimento = ?, preco = ?, tipo = ?, folhas = ? WHERE codigo = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setDouble(1, produto.getAltura());
		comandoSql.setDouble(2, produto.getComprimento());
		comandoSql.setDouble(3, produto.getPreco());
		comandoSql.setString(4, produto.getTipo());
		comandoSql.setInt(5, produto.getFolhas());
		comandoSql.setInt(6, produto.getCodigo());
		
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Atualizacao realizada com sucesso!");
	}
	
	public void excluirProduto(int Cod_Pro) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM janela WHERE Cod_Pro = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setInt(1, Cod_Pro);
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Exclusao realizada com sucesso!");
	}
	
	public JanelaBean consultarProduto(int codigo) throws SQLException, ClassNotFoundException{
		JanelaBean produtoBean = null;
		String sql = "SELECT * FROM janela where cod_pro = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setInt(1, codigo);
		ResultSet rs = comandoSql.executeQuery();
		if (rs.next()){
			produtoBean = new JanelaBean();
			produtoBean.setCodigo(rs.getInt("codigo"));
			produtoBean.setAltura(rs.getDouble("altura"));
			produtoBean.setComprimento(rs.getDouble("comprimento"));
			produtoBean.setPreco(rs.getDouble("preco"));
			produtoBean.setTipo(rs.getString("tipo"));
			produtoBean.setFolhas(rs.getInt("folhas"));
		}
		return produtoBean;
	}

}
