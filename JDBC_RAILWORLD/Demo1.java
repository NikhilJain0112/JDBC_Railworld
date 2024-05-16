import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b1;
	FDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		t1=new JTextField(20);
		add(t1);
		t2=new JTextField(20);
		add(t2);
		b1=new JButton("Insert..");
		add(b1);
		b1.addActionListener(this);
		
	}
public void actionPerformed(ActionEvent e)
{
	// System.out.println("sajal");
	String s1=t1.getText();
	String s2=t2.getText();
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sajal";
		String name="root";
		String pass="root";
		Connection con=DriverManager.getConnection(url,name,pass);
		Statement st=con.createStatement();
		String q="insert into A values('"+s1+"','"+s2+"')";
        st.executeUpdate(q);
		t1.setText("");
		t2.setText("");
		
con.close();		
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
}	
}
class Demo1
{
	public static void main(String ad[])
	{
FDemo d=new FDemo();
d.setVisible(true);
d.setSize(300,300);
d.setLocation(200,200);
d.setDefaultCloseOperation(d.EXIT_ON_CLOSE);		
	}
	
}