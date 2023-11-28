package application.persitencia;

import java.sql.SQLException;


public interface ICrud<T> {
	public void insert (T t) throws SQLException,ClassNotFoundException;
	public void  atualizar(T t) throws SQLException,ClassNotFoundException;
	


}
