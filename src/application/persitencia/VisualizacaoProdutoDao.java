package application.persitencia;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.model.CadastroProdutoParceiro;

public class VisualizacaoProdutoDao implements ICrudConsulta<CadastroProdutoParceiro>{
	
private GenericDao gDao;
public int cont;
	
	public VisualizacaoProdutoDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	

	@Override
	public CadastroProdutoParceiro consultar(CadastroProdutoParceiro pp) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "SELECT id_produto, nome_produto, descricao, genero, material, composicao, origem, "
				+ "indicado, marca, categoria, tamanho, qtd_estoque, cor, preco_venda FROM Produto WHERE id_produto = ?";
		PreparedStatement ps = c.prepareStatement(sql);
	 
		ps.setInt(1, pp.getCodProduto());
	    ResultSet rs = ps.executeQuery();
	     if (rs.next()) {
	    	 pp.setCodProduto(rs.getInt("id_produto"));
	    	 pp.setNomeProduto(rs.getString("nome_produto"));
	    	 pp.setDescricao(rs.getString("descricao"));
	    	 pp.setGenero(rs.getString("genero"));
	    	 pp.setMaterial(rs.getString("material"));
	    	 pp.setComposicao(rs.getString("composicao"));
	    	 pp.setOrigem(rs.getString("origem"));
	    	 pp.setIndicacao(rs.getString("indicado"));
	    	 pp.setMarca(rs.getString("marca"));
	    	 pp.setCategoria(rs.getString("categoria"));
	    	 pp.setTamanho(rs.getInt("tamanho"));
	    	 pp.setQtdEstoque(rs.getInt("qtd_estoque"));
	    	 pp.setCor(rs.getString("cor"));
	    	 pp.setPrecoVenda(rs.getFloat("preco_venda")); 
	    	 
	     }
	        rs.close();
			ps.close();
			c.close();
		return pp;
	}

	
}
	

