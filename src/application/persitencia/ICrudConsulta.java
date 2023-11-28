package application.persitencia;

import java.sql.SQLException;

public interface ICrudConsulta <T>{
	public  T consultar(T t) throws SQLException,ClassNotFoundException;
}
