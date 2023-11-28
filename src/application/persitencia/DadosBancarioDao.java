package application.persitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.model.CadastroParceiro;
import application.model.DadosBancarios1;


public class DadosBancarioDao implements ICrud<DadosBancarios1>,ICrudConsulta<DadosBancarios1>,ICrudLista<DadosBancarios1>,ICrudExcluir<DadosBancarios1>{
	private GenericDao gDao;
	
	

	public DadosBancarioDao(GenericDao gDao) {
		this.gDao = gDao;
	}

	@Override
	public void insert(DadosBancarios1 t) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="INSERT INTO Dados_Bancarios values(?,?,?,?,?,?,?)";
		PreparedStatement ps =c.prepareStatement(sql);
		CadastroParceiro p = new CadastroParceiro();
		
		ps.setInt(1,p.getCodparc());
	
		ps.setString(2,t.getBanco());
		ps.setString(3,t.getAgencia());
		ps.setString(4,t.getNumconta());
		ps.setString(5,t.getTipodeconta());
		ps.setString(6,t.getNometitular());
		ps.setString(7,t.getCnpj());
		
		ps.execute();
		ps.close();
		c.close();
	}                  
	
	 
	@Override
	public void atualizar(DadosBancarios1 t) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="UPDATE Dados_Bancarios SET banco=?, agencia=?, numconta=?, tipoconta=?, nometitular=?, cnpj=? WHERE id_dados_bancarios=? ";
		PreparedStatement ps =c.prepareStatement(sql);
		ps.setString(1,t.getBanco());
		ps.setString(2,t.getAgencia());
		ps.setString(3,t.getNumconta());
		ps.setString(4,t.getTipodeconta());
		ps.setString(5,t.getNometitular());
		ps.setString(6,t.getCnpj());
		CadastroParceiro p = new CadastroParceiro();
		ps.setInt(7,p.getCodparc());
		ps.execute();
		ps.close();
		c.close();
		}

	@Override
	public void excluir(DadosBancarios1 t) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="DELETE Dados_Bancarios  WHERE  id_dados_bancarios=?";
		PreparedStatement ps =c.prepareStatement(sql);
		CadastroParceiro p = new CadastroParceiro();
		ps.setInt(1,p.getCodparc());
		ps.execute();
		ps.close();
		c.close();
		
	}

	@Override
	public DadosBancarios1 consultar(DadosBancarios1 t) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql ="SELECT  id_dados_bancarios, banco, agencia, numconta, tipoconta, nometitular, cnpj FROM Dados_Bancarios WHERE  id_dados_bancarios =?";
		PreparedStatement ps =c.prepareStatement(sql);
		CadastroParceiro p = new CadastroParceiro();
		ps.setInt(1,p.getCodparc());
		ResultSet rs =ps.executeQuery();
		if(rs.next()) {
			
			t.setBanco(rs.getString("banco"));
			t.setAgencia(rs.getString("agencia"));
			t.setNumconta(rs.getString("numconta"));
			t.setTipodeconta(rs.getString("tipoconta"));
			t.setNometitular(rs.getString("nometitular"));
			t.setCnpj(rs.getString("cnpj"));
		
		}
		
		ps.execute();
		ps.close();
		c.close();
		return t;
	}
	
	
	
	@Override
	public List<DadosBancarios1> Listar() throws SQLException, ClassNotFoundException {
		List<DadosBancarios1> dados = new ArrayList<>();
		Connection c = gDao.getConnection();
		String sql ="SELECT  banco, agencia, numconta, tipoconta, nometitular, cnpj FROM Dados_Bancarios WHERE  id_dados_bancarios =?";
		PreparedStatement ps =c.prepareStatement(sql);
		CadastroParceiro p = new CadastroParceiro();
		ps.setInt(1,p.getCodparc());
		
		ResultSet rs =ps.executeQuery();
		while (rs.next()) {
			DadosBancarios1 t = new DadosBancarios1();
			t.setBanco(rs.getString("banco"));
			t.setAgencia(rs.getString("agencia"));
			t.setNumconta(rs.getString("numconta"));
			t.setTipodeconta(rs.getString("tipoconta"));
			t.setNometitular(rs.getString("nometitular"));
			t.setCnpj(rs.getString("cnpj"));
			
			
			dados.add(t);
		}
		rs.close();
		ps.close();
		c.close();
		return dados;
	}

	
}