import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Demo9
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
	
    String q="update A set name='sajaljainam' where pass='123'";
	st.executeUpdate(q);
    con.close();		


	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	
}
}