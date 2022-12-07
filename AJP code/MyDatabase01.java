import java.io.DataInputStream; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyDatabase01 {

	public static void main(String[] args) {
		DataInputStream isd = new DataInputStream(System.in);
		try {
			String q = "create Table Student2 (Reg integer,Name varchar(255),Batch varchar(255),Department varchar(255),Address varchar(255));";
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/mydatabase","root","root123");  
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table Created Successfully...");
			con.close();
			}catch(Exception e){ System.out.println(e);}  
	}

}