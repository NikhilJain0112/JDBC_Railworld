import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Demo6
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
	System.out.println("All contant are display= ");
    while(rs.next())
	{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2));
	
	}
	System.out.println("Next Contant Nahi Hai Means Row Nahi Hai To False Return= ");
	System.out.println(rs.next());
    con.close();		


	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	
}
}