import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Demo8
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
	String q="select * from A where name='sajal' AND pass='123'";

	// st.executeUpdate(q);
    ResultSet rs=st.executeQuery(q);
	System.out.println("sajal wala contant display hoga= ");
    while(rs.next())
	{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2));
	
	}
    con.close();		


	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	
}
}