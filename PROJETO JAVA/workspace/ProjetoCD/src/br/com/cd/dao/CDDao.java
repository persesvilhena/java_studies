package br.com.cd.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cd.bean.CDBean;
import br.com.cd.conexao.Conexao;

public class CDDao {
	public void cadastrarProduto(CDBean produto) throws SQLException, ClassNotFoundException{
		String Sql = "INSERT INTO cd (nome, artista, descricao, numerodefaixas, ano, preco) VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(Sql);
		comandoSql.setString(1, produto.getNome());
		comandoSql.setString(2, produto.getArtista());
		comandoSql.setString(3, produto.getDescricao());
		comandoSql.setInt(4, produto.getNumerodefaixas());
		comandoSql.setInt(5, produto.getAno());
		comandoSql.setDouble(6, produto.getPreco());
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Insercao realizada com sucesso!");
	}
	
	public void alterarProduto(CDBean produto) throws SQLException, ClassNotFoundException{
		String sql = "UPDATE cd SET nome = ?, artista = ?, descricao = ?, numerodefaixas = ?, ano = ?, preco = ? WHERE cod = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setString(1, produto.getNome());
		comandoSql.setString(2, produto.getArtista());
		comandoSql.setString(3, produto.getDescricao());
		comandoSql.setInt(4, produto.getNumerodefaixas());
		comandoSql.setInt(5, produto.getAno());
		comandoSql.setDouble(6, produto.getPreco());
		comandoSql.setInt(7, produto.getCod());
		
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Atualizacao realizada com sucesso!");
	}
	
	public void excluirProduto(int cod) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM cd WHERE cod = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setInt(1, cod);
		comandoSql.execute();
		Conexao.getInstance().commit();
		System.out.println("Exclusao realizada com sucesso!");
	}
	
	public CDBean consultarProduto(int codigo) throws SQLException, ClassNotFoundException{
		CDBean produtoBean = null;
		String sql = "SELECT * FROM cd where cod = ?";
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setInt(1, codigo);
		ResultSet rs = comandoSql.executeQuery();
		if (rs.next()){
			produtoBean = new CDBean();
			produtoBean.setCod(rs.getInt("cod"));
			produtoBean.setNome(rs.getString("nome"));
			produtoBean.setArtista(rs.getString("artista"));
			produtoBean.setDescricao(rs.getString("descricao"));
			produtoBean.setNumerodefaixas(rs.getInt("numerodefaixas"));
			produtoBean.setAno(rs.getInt("ano"));
			produtoBean.setPreco(rs.getDouble("preco"));
		}
		return produtoBean;
	}

}
