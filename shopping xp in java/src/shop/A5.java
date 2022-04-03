package shop;

import java.sql.Connection;
import java.sql.DriverManager;

	public class A5 {
		static Connection con;
        public static Connection cr() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String user = "root";
				String password = "pass";
				String url = "jdbc:mysql://localhost:3306/ele";
				con = DriverManager.getConnection(url, user, password);	
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return con;			
		}

	}

