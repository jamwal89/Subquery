import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Subquery {
	Statement stmt = null;
	PreparedStatement pstmt;
	ResultSet rs= null;
	
	public void Query(Connection con){
		try {
			pstmt=con.prepareStatement("select  (select count(*) from Customers ) , (select count(*) from States) , (Select Count(*) from Company) from dual");
			rs=pstmt.executeQuery();
			
			while(rs.next()){
			String Customers= rs.getString(1);
			String States =rs.getString(2);
			String Companies= rs.getString(3);
			
			
			System.out.print("Number of Customers "+ Customers+"\t"+"Number of States "+States+ "\t"+"Number of Companies "+Companies);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}