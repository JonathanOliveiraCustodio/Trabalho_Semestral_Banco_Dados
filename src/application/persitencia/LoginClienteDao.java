package application.persitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.model.CadastroCliente;

public class LoginClienteDao implements ICrudConsulta<CadastroCliente>{
	private GenericDao gDao;
	
	public  LoginClienteDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public CadastroCliente consultar(CadastroCliente t) throws SQLException, ClassNotFoundException {
		Connection j = gDao.getConnection();
        
		StringBuffer sql = new StringBuffer();
		sql.append("Select id_cliente,  email, senha ");
		sql.append("from Cliente ");
		sql.append("Where email =?  ");
		PreparedStatement ps = j.prepareStatement(sql.toString());
		ps.setString(1, t.getEmail_cli());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
	    	 t.setCodcli(rs.getInt("id_cliente"));
	    	 t.setEmail_cli(rs.getString("email"));
	    	 t.setSenha(rs.getString("senha"));
	    	 
	    	 
	    	 
	     }
	     rs.close();
	 	ps.close();
	 	j.close();
	return t;
	}
}
