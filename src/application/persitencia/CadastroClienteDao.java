package application.persitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.model.CadastroCliente;

public class CadastroClienteDao implements ICrud<CadastroCliente>, ICrudConsulta<CadastroCliente> {
	private GenericDao gDao;
	
	public CadastroClienteDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public void insert(CadastroCliente p) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="INSERT INTO Cliente VALUES (?,?,?,?,?,?,?)";
		PreparedStatement ps =c.prepareStatement(sql);
		ps.setInt(1,p.getCodcli());
		ps.setString(2,p.getNome_cli());
		ps.setString(3,p.getCpf());
		ps.setString(4,p.getDatanasc());
		ps.setString(5,p.getEmail_cli());
		ps.setString(6,p.getTelefone_cli());
		ps.setString(7, p.getSenha());
		ps.execute();
		
		
		String sql1 ="INSERT INTO ENDERECO VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement s =c.prepareStatement(sql1);
		s.setInt(1,p.getCodcli());
		s.setString(2,p.getLogradou_cli());
		s.setString(3,p.getCep_cli());
		s.setString(4,p.getBairro_cli());
		s.setString(5,p.getComplemento_cli());
		s.setInt(6,p.getNum_cli());
		s.setString(7,p.getCidade_cli());
		s.setString(8,p.getEstado_cli());
		s.setString(9,p.getPonto_cli());
		s.execute();
		s.close();
		ps.close();
		c.close();
		
		
	}

	@Override
	public void atualizar(CadastroCliente p) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="UPDATE Cliente SET  nome=?, cpf=?, data_nascimento=?, email=?, telefone=?, senha=? WHERE id_cliente=? ";
		PreparedStatement ps =c.prepareStatement(sql);
		CadastroCliente pp = new CadastroCliente();
		
		ps.setString(1,p.getNome_cli());
		ps.setString(2,p.getCpf());
		ps.setString(3,p.getDatanasc());
		ps.setString(4,p.getEmail_cli());
		ps.setString(5,p.getTelefone_cli());
		ps.setString(6, p.getSenha());
		ps.setInt(7,pp.getCodcli());
		ps.execute();
		
		
		String sql1 ="UPDATE ENDERECO SET  logradouro=?, cep=?, bairro=?,complemento=?, numero=?,"
				+ "cidade=?, estado=?,ponto_referencia=? WHERE ID=?";
		PreparedStatement s =c.prepareStatement(sql1);
		s.setString(1,p.getLogradou_cli());
		s.setString(2,p.getCep_cli());
		s.setString(3,p.getBairro_cli());
		s.setString(4,p.getComplemento_cli());
		s.setInt(5,p.getNum_cli());
		s.setString(6,p.getCidade_cli());
		s.setString(7,p.getEstado_cli());
		s.setString(8,p.getPonto_cli());
		s.setInt(9,pp.getCodcli());
		s.execute();
		
		ps.execute();
		ps.close();
		s.close();
		c.close();
		
		
		
	}

	@Override
	public CadastroCliente consultar(CadastroCliente cc) throws SQLException, ClassNotFoundException {
		Connection j = gDao.getConnection();
	                                                                    
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT e.logradouro, e.cep, e.bairro,e.complemento,e.numero,e.cidade, e.estado,e.ponto_referencia, ");
		sql.append("c.id_cliente, c.nome , c.cpf ,convert(char(10), c.data_nascimento,103) as data_nascimento, c.email, c.telefone, c.senha ");
		sql.append("FROM Cliente c, ENDERECO e ");
		sql.append("WHERE c.id_cliente = e.id ");
		sql.append("AND c.id_cliente = ? ");
		PreparedStatement ps = j.prepareStatement(sql.toString());
		CadastroCliente c = new CadastroCliente();
		
		ps.setInt(1,c.getCodcli());
		
		ResultSet rs = ps.executeQuery();
	     if (rs.next()) {
	    	 cc.setCodcli(rs.getInt("id_cliente"));
	    	 cc.setNome_cli(rs.getString("nome"));
	    	 cc.setCpf(rs.getString("cpf"));
	    	 cc.setDatanasc(rs.getString("data_nascimento"));
	    	 cc.setEmail_cli(rs.getString("email"));
	    	 cc.setTelefone_cli(rs.getString("telefone"));
	    	 cc.setSenha(rs.getString("senha"));
	        
	    	cc.setLogradou_cli(rs.getString("logradouro"));
	    	cc.setCep_cli(rs.getString("cep")); 
	    	cc.setBairro_cli(rs.getString("bairro"));
	    	cc.setComplemento_cli(rs.getString("complemento")); 
	    	cc.setNum_cli(rs.getInt("numero")); 
	    	cc.setCidade_cli(rs.getString("cidade")); 
	    	cc.setEstado_cli(rs.getString("estado"));
	    	cc.setPonto_cli(rs.getString("ponto_referencia"));
	     }
	     rs.close();
		 ps.close();
		 j.close();
		 
		return cc;
	}

}
