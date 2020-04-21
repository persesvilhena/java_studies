package br.com.info.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.info.bean.ProdutoBean;
import br.com.info.conexao.Conexao;

public class ProdutoDao {
	public void cadastrarProduto(ProdutoBean produto) throws SQLException, ClassNotFoundException{
		String Sql = "INSERT INTO produto (Nom_Pro, Des_Pro, For_Pro, Pre_Pro, Ven_Pro) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(Sql);
		comandoSql.setString(1, produto.getNome());
		comandoSql.setString(2, produto.getDescricao());
		comandoSql.setString(3, produto.getFornecedor());
		comandoSql.setDouble(4, produto.getPrecocompra());
		comandoSql.setDouble(5, produto.getPrecovenda());
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Insercao realizada com sucesso!");
	}
	
	public void alterarProduto(ProdutoBean produto) throws SQLException, ClassNotFoundException{
		String sql = "UPDATE produto SET Nom_Pro = ?, Des_Pro = ?, For_Pro = ?, Pre_Pro = ?, Ven_Pro = ? WHERE Cod_Pro = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setString(1, produto.getNome());
		comandoSql.setString(2, produto.getDescricao());
		comandoSql.setString(3, produto.getFornecedor());
		comandoSql.setDouble(4, produto.getPrecocompra());
		comandoSql.setDouble(5, produto.getPrecovenda());
		comandoSql.setInt(6, produto.getCodigo());
		
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Atualizacao realizada com sucesso!");
	}
	
	public void excluirProduto(int Cod_Pro) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM produto WHERE Cod_Pro = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setInt(1, Cod_Pro);
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Exclusao realizada com sucesso!");
	}
	
	public ProdutoBean consultarProduto(int codigo) throws SQLException, ClassNotFoundException{
		ProdutoBean produtoBean = null;
		String sql = "SELECT * FROM produto where cod_pro = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setInt(1, codigo);
		ResultSet rs = comandoSql.executeQuery();
		if (rs.next()){
			produtoBean = new ProdutoBean();
			produtoBean.setCodigo(rs.getInt("Cod_Pro"));
			produtoBean.setNome(rs.getString("Nom_Pro"));
			produtoBean.setDescricao(rs.getString("Des_Pro"));
			produtoBean.setFornecedor(rs.getString("For_Pro"));
			produtoBean.setPrecocompra(rs.getDouble("Pre_Pro"));
			produtoBean.setPrecovenda(rs.getDouble("Ven_Pro"));
		}
		return produtoBean;
	}

}
