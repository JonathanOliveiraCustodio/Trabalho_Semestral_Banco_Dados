package application.persitencia;

import java.sql.SQLException;
import java.util.List;

public interface ICrudLista <T>{
	public List<T> Listar() throws SQLException,ClassNotFoundException;
}
