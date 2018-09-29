import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

class Pruebas {
	private Dao<Book, Integer> bookDao;
	private Dao<Author, Integer> authorDao;
	private Dao<Customer, Integer> customerDao;
	private final static String DATABASE_URL = "jdbc:mysql://localhost/taller7";
	
	@Test
	void testCustomer() throws Exception  {
	//aqui va el código
		
	}
	

	 
	 

}
