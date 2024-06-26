package Student_From;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student_detail {
    private String rno,batch,dep,address;
    public String name;
    public Student_detail(String name1,String rn, String b,String d,String add)
    {
        name=name1;
        rno=rn;
        batch=b;
        dep=d;
        address=add;
    }
    public Student_detail()
    {

    }
    public int add_detail()
    {
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        	Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/mydatabase","root","root123");
            String querry="VALUES(?,?,?,?,?) ";
            String query1 = "INSERT INTO Student2 "+"(Reg,Name,Batch,Department,Address)" +querry;
            PreparedStatement mystmt=con.prepareStatement(query1);
            mystmt.setString(1,rno);
            mystmt.setString(2, name);
            mystmt.setString(3, batch);
            mystmt.setString(4, dep);
            mystmt.setString(5, address);
            mystmt.execute();
            con.close();
            return(1);
        } 
        catch (Exception e) 
        {
            return(0);
        }
    }
    public int check(String id)
    {
        try 
        {
            rno=id;
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        	Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/mydatabase","root","root123");
            PreparedStatement stmt=con.prepareStatement("SELECT Name FROM Student2 WHERE Reg=?");
            stmt.setString(1, id);
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
            {
                name=rs.getString("Name");
                return(1);
            }
            else    
                return(0);
        } 
        catch (Exception e) 
        {
           return(0);
        }
    }
    public int update(String add)
    {
        try 
        {
            System.out.println(rno);
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        	Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/mydatabase","root","root123");
            PreparedStatement stmt=con.prepareStatement("UPDATE Student2 SET `Address`=? WHERE Reg=?");
            stmt.setString(1, add);
            stmt.setString(2, rno);
            System.out.println(add);
            stmt.executeUpdate();
            return(1);
        } 
        catch (Exception e) 
        {
            return(0);
        }
    }
    public int deleted(String id)
    {
        try 
        {
            
        	Class.forName("com.mysql.cj.jdbc.Driver"); 
        	Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/mydatabase","root","root123");
            PreparedStatement stmt=con.prepareStatement("DELETE FROM Student2 WHERE Reg=?");
            stmt.setString(1, id);
            stmt.execute();
            return(1);
        } 
        catch (Exception e) 
        {
           return(0);
        }
    }
}
