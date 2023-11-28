package application.persitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.model.CadastroParceiro;
import application.model.CadastroProdutoParceiro;

public class PesquisaProdutoDao implements ICrudConsulta<CadastroProdutoParceiro>{
	
private GenericDao gDao;
public int cont;
	
	public PesquisaProdutoDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	

	@Override
	public CadastroProdutoParceiro consultar(CadastroProdutoParceiro pp) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		StringBuffer sql = new StringBuffer();
		
		 sql.append("SELECT  p.nome_produto,p.marca ");
		 sql.append("p.tamanho,  p.preco_venda ");
		 sql.append("FROM Produto p , Parceiro pa ");
		 sql.append("Where pa.codparc = p.codparc ");
		 sql.append("and p.id_produto=? ");
		 sql.append("and p.codparc=? ");
		PreparedStatement ps = c.prepareStatement(sql.toString());
		CadastroParceiro p = new CadastroParceiro();
		
		
		ps.setInt(1, pp.getCodProduto());
		ps.setInt(2, p.getCodparc());
	    ResultSet rs = ps.executeQuery();
	     if (rs.next()) {
	    	 pp.setNomeProduto(rs.getString("nome_produto"));
	    	 pp.setTamanho(rs.getInt("tamanho"));
	    	 pp.setMarca(rs.getString("marca"));
	    	 pp.setPrecoVenda(rs.getFloat("preco_venda")); 
	     	 
	     }
	   
	        rs.close();
			ps.close();
			c.close();
		return pp;
	}
	public List<CadastroProdutoParceiro> Listar() throws SQLException, ClassNotFoundException {
		List<CadastroProdutoParceiro> produtosParceiro = new ArrayList<>();	
		Connection c = gDao.getConnection();
		String sql = "SELECT p.id_produto, p.nome_produto, p.descricao, p.genero, p.material, p.composicao, p.origem,"
				+ "p.indicado, p.marca, p.categoria, p.tamanho, p.qtd_estoque, p.cor, p.preco_venda FROM Produto p , Parceiro pa where p.codparc = pa.codparc  ";
		PreparedStatement ps = c.prepareStatement(sql);
		
	    
		ResultSet rs = ps.executeQuery();
		 while (rs.next()) { 
			 CadastroProdutoParceiro pp = new CadastroProdutoParceiro();
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
			 produtosParceiro.add(pp);
		 }
		 rs.close();
		 ps.close();
		 c.close();
		return produtosParceiro;
	}


	
}
	