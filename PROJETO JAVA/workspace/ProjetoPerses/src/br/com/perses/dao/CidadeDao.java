package br.com.perses.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.perses.bean.CidadeBean;
import br.com.perses.conexao.Conexao;

public class CidadeDao {
	
	/**
	 * O metodo busca uma cidade pelo codigo
	 * @param cidCod
	 * @return cidade
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public CidadeBean consultarCidadePorCod(int CodCid) throws SQLException, ClassNotFoundException {
		CidadeBean cidade = null;
		String sql = "SELECT * FROM cidade WHERE CodCid = ?";

		PreparedStatement comandoSQL = Conexao.getInstance().prepareStatement(sql);
		comandoSQL.setInt(1, CodCid);
		ResultSet rs = comandoSQL.executeQuery();

		while (rs.next()) {
			cidade = new CidadeBean();
			cidade.setCodCid(rs.getInt("CodCid"));
			cidade.setNomCid(rs.getString("NomCid"));
			cidade.setUfCid(rs.getString("UfCid"));
		}
		
		return cidade;
	}
	
	/**
	 * O metodo busca o codigo de uma cidade pelo nome 
	 * @param cidNome
	 * @return codigo
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public int consultarCidadePorNome(String NomCid) throws SQLException, ClassNotFoundException {
		int codigo = -1;
		String sql = "SELECT * FROM cidade WHERE NomCid = ?";

		PreparedStatement comandoSQL = Conexao.getInstance().prepareStatement(sql);
		comandoSQL.setString(1, NomCid);
		ResultSet rs = comandoSQL.executeQuery();

		if (rs.next()) {
			codigo = rs.getInt("CodCid");
		}

		return codigo;
	}

	/**
	 * O metodo busca as cidades de um estado
	 * @param cidUf
	 * @return listaCidades
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public List<CidadeBean> consultarCidadePorUf(String cidUf) throws SQLException, ClassNotFoundException {
		List<CidadeBean> listaCidades = null;
		String sql = "SELECT * FROM cidade WHERE UfCid = ?";

		PreparedStatement comandoSQL = Conexao.getInstance().prepareStatement(sql);
		comandoSQL.setString(1, cidUf);
		// ResultSet contem o resultado do sql
		ResultSet rs = comandoSQL.executeQuery();

		listaCidades = new ArrayList<CidadeBean>();
		while (rs.next()) {
			CidadeBean cidade = new CidadeBean();
			cidade.setCodCid(rs.getInt("CodCid"));
			cidade.setNomCid(rs.getString("NomCid"));
			cidade.setUfCid(rs.getString("UfCid"));

			listaCidades.add(cidade);
		}

		return listaCidades;
	}
	
	/**
	 * O metodo busca todas as cidades
	 * @param 
	 * @return listaCidades
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public List<CidadeBean> consultarCidades() throws SQLException, ClassNotFoundException {
		List<CidadeBean> listaCidades = null;
		String sql = "SELECT * FROM cidade ORDER BY NomCid";

		PreparedStatement comandoSQL = Conexao.getInstance().prepareStatement(sql);
		
		ResultSet rs = comandoSQL.executeQuery();

		listaCidades = new ArrayList<CidadeBean>();
		while (rs.next()) {
			CidadeBean cidade = new CidadeBean();
			cidade.setCodCid(rs.getInt("CodCid"));
			cidade.setNomCid(rs.getString("NomCid"));
			cidade.setUfCid(rs.getString("UfCid"));

			listaCidades.add(cidade);
		}

		return listaCidades;
	}
}
