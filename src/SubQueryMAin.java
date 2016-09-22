import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SubQueryMAin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Subquery sq=new Subquery();
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
		
		sq.Query(con);

	}

}
