import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Demo4
{
	public static void main(String ad[])
	{
	
	try{
		
		Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/sajal";
	String name="root";
	String pass="root";
	Connection con=DriverManager.getConnection(url,name,pass);
	Statement st=con.createStatement();
	String q="select * from A";

	// st.executeUpdate(q);
    ResultSet rs=st.executeQuery(q);
    rs.next();		
	
	System.out.println("First row ka data show hoga= ");
	
	System.out.println(rs.getString(1)+"\t"+rs.getString(2));
	rs.next();
	System.out.println("Second row ka data show hoga= ");
	System.out.println(rs.getString(1)+"\t"+rs.getString(2));
    con.close();		


	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	
}
}