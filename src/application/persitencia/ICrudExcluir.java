package application.persitencia;

import java.sql.SQLException;

public interface ICrudExcluir <T>{
	public void excluir(T t) throws SQLException,ClassNotFoundException;
}
