package application.persitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.model.CadastroCliente;
import application.model.CadastroParceiro;
import application.model.CadastroProdutoParceiro;

public class ListaVendasDao implements ICrudConsulta<CadastroProdutoParceiro>,ICrudLista<CadastroProdutoParceiro>,ICrud<CadastroProdutoParceiro>{
	private GenericDao gDao; 
	public ListaVendasDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public CadastroProdutoParceiro consultar(CadastroProdutoParceiro t) throws SQLException, ClassNotFoundException {
		return null;
	}

	@Override
	public List<CadastroProdutoParceiro> Listar() throws SQLException, ClassNotFoundException {
		List<CadastroProdutoParceiro> produtosParceiro = new ArrayList<>();	
		Connection c = gDao.getConnection();
		String sql = "SELECT p.id_produto, p.nome_produto, p.descricao, p.genero, p.material, p.composicao, p.origem,"
				+ "p.indicado, p.marca, p.categoria, p.tamanho, p.qtd_estoque, p.cor, p.preco_venda FROM Produto p , Parceiro pa , venda v "
				+ "where  v.codpod =p.id_produto "
				+ "and  pa.codparc =p.codparc and pa.codparc=? ";
		CadastroParceiro p = new CadastroParceiro();
		
		
		PreparedStatement ps = c.prepareStatement(sql);
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

	@Override
	public void insert(CadastroProdutoParceiro p) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		CadastroCliente cl = new CadastroCliente();
		String sql = "Insert into Venda values (?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		
		ps.setInt(1, p.getCodProduto());
		ps.setInt(2, cl.getCodcli());
		ps.execute();
		
		ps.close();
		c.close();
		
	}

	@Override
	public void atualizar(CadastroProdutoParceiro t) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}
