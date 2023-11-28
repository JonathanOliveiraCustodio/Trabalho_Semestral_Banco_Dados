package application.persitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.model.CadastroParceiro;


public class LoginParceiroDao implements ICrudConsulta<CadastroParceiro>{
	private GenericDao gDao;
	
	public LoginParceiroDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public CadastroParceiro consultar(CadastroParceiro t) throws SQLException, ClassNotFoundException {
		Connection j = gDao.getConnection();
        
		StringBuffer sql = new StringBuffer();
		sql.append("Select codparc, senha, email ");
		sql.append("from Parceiro ");
		sql.append("Where email =?  ");
		PreparedStatement ps = j.prepareStatement(sql.toString());
		ps.setString(1, t.getEmail());
		
		ResultSet rs = ps.executeQuery();
	     if (rs.next()) {
	    	 t.setCodparc(rs.getInt("codparc"));
	    	 t.setEmail(rs.getString("email"));
	    	 t.setSenha(rs.getString("senha"));
	    	 
	    	 
	     }
	     rs.close();
	 	ps.close();
	 	j.close();
		return t;
	}


}
