import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Conn
{
	public static Connection conn = null;
	public static PreparedStatement prepStatement = null;
	public static Statement statement = null;
	public static Statement stmt = null;
	public static int resultSet2;
	public static ResultSet resultSet = null;
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int cont = 0;
	public static int aux = 0;
	
	
	public Conn()
	{
		
	}
	
	public void check()
	{
		String driverUrl = "com.mysql.jdbc.Driver";
		
		try 
		{
			Class.forName(driverUrl);
			System.out.println("Driver Found");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		
		String url = "jdbc:mysql://localhost:3306/textyourpath";
		String user = "root";
		String password = "";
		
		try 
		{
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Ligacao a base de dados efectuada com sucesso");
			
			statement = (Statement) conn.createStatement();
			
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		
	}
}
