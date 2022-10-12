package dao;
import java.util.*;
import java.sql.*;
import entity.Departments;
import entity.Employee;
public class empDao {

	public static ArrayList<Employee> getAllEmployeeDetails() 
	{
		ResultSet rs;
		Statement st;
		Connection con;
		ArrayList<Employee> al=new ArrayList<>();
		try
		{
		
			Class.forName("com.mysql.jdbc.Driver");
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","Kanna123456");
		st=con.createStatement();
	
			rs=st.executeQuery("select * from emp");
		while(rs.next())
			{
		 al.add(new Employee(rs.getString("firstName"),rs.getString("lastName"),rs.getInt("id"),rs.getFloat("salary"),rs.getString("department")));
				
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return al;
	}
}
