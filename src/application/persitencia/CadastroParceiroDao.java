package application.persitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import application.model.CadastroParceiro;

public class CadastroParceiroDao implements ICrud<CadastroParceiro>,ICrudConsulta<CadastroParceiro>{
	private GenericDao gDao;
	
	public CadastroParceiroDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public void insert(CadastroParceiro p) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="INSERT INTO Parceiro VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps =c.prepareStatement(sql);
		ps.setInt(1,p.getCodparc());
		ps.setString(2,p.getNome());
		ps.setString(3,p.getCnpj());
		ps.setString(4,p.getSocial());
		ps.setString(5,p.getNomefant());
		ps.setString(6,p.getTelefone());
		ps.setString(7,p.getEmail());
		ps.setString(8, p.getSenha());
		
		ps.setString(9,p.getDataAbert());
		ps.execute();
		
		String sql1 ="INSERT INTO ENDERECO VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement s =c.prepareStatement(sql1);
		s.setInt(1,p.getCodparc());
		s.setString(2,p.getLogradouro());
		s.setString(3,p.getCep());
		s.setString(4,p.getBairro());
		s.setString(5,p.getComplemento());
		s.setInt(6, p.getNum());
		s.setString(7, null);
		s.setString(8, null);
		s.setString(9, null);
		s.execute();
		s.close();
		ps.close();
		c.close();
		
	}
	 
	
	@Override
	public void atualizar(CadastroParceiro p) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="UPDATE Parceiro SET  nome=?, cnpj=? , social=?, nomefant=?, "
				+ " telefone=?, email=?, senha=?,  "
				+ " dataAbert=? WHERE codparc =?";
		
		
		PreparedStatement ps =c.prepareStatement(sql);
		
		ps.setString(1,p.getNome());
		ps.setString(2,p.getCnpj());
		ps.setString(3,p.getSocial());
		ps.setString(4,p.getNomefant());
		ps.setString(5,p.getTelefone());
		ps.setString(6,p.getEmail());
		ps.setString(7, p.getSenha());
		ps.setString(8,p.getDataAbert());
		ps.setInt(9,p.getCodparc());
		ps.execute();
		
		String sql1 ="UPDATE ENDERECO SET logradouro=?, cep=?, bairro=?,complemento=?, numero=?	WHERE ID=? ";
		PreparedStatement s =c.prepareStatement(sql1);
		
		s.setString(1,p.getLogradouro());
		s.setString(2,p.getCep());
		s.setString(3,p.getBairro());
		s.setString(4,p.getComplemento());
		s.setInt(5, p.getNum());
		s.setInt(6,p.getCodparc());
		
		s.execute();
		s.close();
		
		ps.close();
		c.close();
		
	}

	@Override
	public CadastroParceiro consultar(CadastroParceiro c) throws SQLException, ClassNotFoundException {
		Connection j = gDao.getConnection();
        
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT e.logradouro, e.cep, e.bairro,e.complemento,e.numero, ");
		sql.append("p.codparc, p.nome , p.cnpj , p.social, p.nomefant, p.telefone, p.email, p.senha,convert(char(10), p.dataAbert,103) as dataAbert ");
		sql.append("FROM Parceiro p, ENDERECO e ");
		sql.append("WHERE p.codparc = e.id ");
		sql.append("AND  p.codparc = ? ");
		PreparedStatement ps = j.prepareStatement(sql.toString());
		
		ps.setInt(1, c.getCodparc());
		
		ResultSet rs = ps.executeQuery();
	     if (rs.next()) {
	    	c.setCodparc(rs.getInt("codparc"));
	    	c.setNome(rs.getString("nome"));
	    	c.setCnpj(rs.getString("cnpj"));
	    	c.setSocial(rs.getString("social"));
	    	c.setNomefant(rs.getString("nomefant"));
	    	c.setTelefone(rs.getString("telefone"));
	    	c.setEmail(rs.getString("email"));
	    	c.setSenha(rs.getString("senha"));
	    	c.setDataAbert(rs.getString("dataAbert"));
		 	c.setLogradouro(rs.getString("logradouro"));
		 	c.setCep(rs.getString("cep")); 
		 	c.setBairro(rs.getString("bairro"));
		 	c.setComplemento(rs.getString("complemento")); 
		 	c.setNum(rs.getInt("numero")); 
	}

	rs.close();
	ps.close();
	j.close();

	return c;

	
	}
}

