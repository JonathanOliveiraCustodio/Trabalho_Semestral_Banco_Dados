package application.persitencia;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.model.CadastroParceiro;
import application.model.CadastroProdutoParceiro;

public class CadastroProdutoParceiroDao implements ICrud<CadastroProdutoParceiro>,ICrudConsulta<CadastroProdutoParceiro>,ICrudLista<CadastroProdutoParceiro>,ICrudExcluir<CadastroProdutoParceiro>{
	private GenericDao gDao;
	
	public CadastroProdutoParceiroDao(GenericDao gDao) {
		this.gDao = gDao;
	}

		@Override
	public void insert(CadastroProdutoParceiro pp) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "INSERT INTO Produto VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		CadastroParceiro p =new CadastroParceiro();
		
		ps.setInt(1, pp.getCodProduto());
		ps.setString(2, pp.getNomeProduto());
		ps.setString(3, pp.getDescricao());
		ps.setString(4, pp.getGenero());
		ps.setString(5, pp.getMaterial());
		ps.setString(6, pp.getComposicao());
		ps.setString(7, pp.getIndicacao());
		ps.setString(8, pp.getOrigem());	
		ps.setString(9, pp.getMarca());
		ps.setString(10, pp.getCategoria());
		ps.setInt(11, pp.getTamanho());
		ps.setInt(12, pp.getQtdEstoque());
		ps.setString(13, pp.getCor());
		ps.setFloat(14, pp.getPrecoVenda());
		ps.setInt(15, p.getCodparc());
		ps.execute();
		ps.close();
		c.close();
		
	}

	@Override
	public void atualizar(CadastroProdutoParceiro pp) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "UPDATE Produto SET nome_produto=?, descricao=?, genero=?,"
				+ "material=?, composicao=?,indicado=?, origem=?,"
				+ "marca=?, categoria=?, tamanho=?, qtd_estoque=? ,"
				+ "cor=?, preco_venda=? WHERE id_produto=?";
		
				
		PreparedStatement ps = c.prepareStatement(sql);
	    ps.setString(1, pp.getNomeProduto());
		ps.setString(2, pp.getDescricao());
		ps.setString(3, pp.getGenero());
		ps.setString(4, pp.getMaterial());
		ps.setString(5, pp.getComposicao());
		ps.setString(6, pp.getIndicacao());
		ps.setString(7, pp.getOrigem());	
		ps.setString(8, pp.getMarca());
		ps.setString(9, pp.getCategoria());
		ps.setInt(10, pp.getTamanho());
		ps.setInt(11, pp.getQtdEstoque());
		ps.setString(12, pp.getCor());
		ps.setFloat(13, pp.getPrecoVenda());
		ps.setInt(14,pp.getCodProduto());
		ps.execute();
		ps.close();
		c.close();
	}

	@Override
	public void excluir(CadastroProdutoParceiro pp) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "DELETE Produto WHERE id_produto = ?";
		PreparedStatement ps = c.prepareStatement(sql);
	    ps.setInt(1, pp.getCodProduto());
		ps.execute();
		ps.close();
		c.close();
		
	}

	@Override
	public CadastroProdutoParceiro consultar(CadastroProdutoParceiro pp) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();

		StringBuffer sql = new StringBuffer();
		
		 sql.append("SELECT p.id_produto, p.nome_produto, p.descricao, p.genero, p.material, p.composicao, p.origem, ");
		 sql.append("p.indicado, p.marca, p.categoria,p.tamanho, p.qtd_estoque, p.cor, p.preco_venda ");
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
	public String consultaVlor(String p2) throws ClassNotFoundException, SQLException {
		Connection c = gDao.getConnection();
		String sql ="Select sum(p.preco_venda) as total "
				+ "from Parceiro pa, Venda v, Produto p "
				+ "where v.codpod = p.id_produto and p.codparc=pa.codparc and pa.codparc=? ";
		PreparedStatement ps = c.prepareStatement(sql.toString());
		CadastroParceiro p = new CadastroParceiro();
		ps.setInt(1, p.getCodparc());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			p2=rs.getString("total"); 
		}
		rs.close();
		ps.close();
		c.close();
		return p2;
	}

	@Override
	public List<CadastroProdutoParceiro> Listar() throws SQLException, ClassNotFoundException {
		List<CadastroProdutoParceiro> produtosParceiro = new ArrayList<>();	
		Connection c = gDao.getConnection();
		String sql = "SELECT p.id_produto, p.nome_produto, p.descricao, p.genero, p.material, p.composicao, p.origem,"
				+ "p.indicado, p.marca, p.categoria, p.tamanho, p.qtd_estoque, p.cor, p.preco_venda FROM Produto p , Parceiro pa where p.codparc = pa.codparc  and p.codparc = ? ";
		PreparedStatement ps = c.prepareStatement(sql);
		CadastroParceiro p = new CadastroParceiro();
		
		
		ps.setInt(1, p.getCodparc());
	    
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