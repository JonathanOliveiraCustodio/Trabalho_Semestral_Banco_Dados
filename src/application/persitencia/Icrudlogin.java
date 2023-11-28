package application.persitencia;

import java.sql.SQLException;

public interface Icrudlogin <T>{
	public  T consultar(T t, int h) throws SQLException,ClassNotFoundException;
}