package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class A4 {
	
	
	
	public static boolean insert(A3 m) {
		
		boolean f = false;
		try {
		Connection con =A5.cr();
		String q = "insert into ele2(ename,ecost) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,m.getEname());
		pstmt.setString(2,m.getEcost());
		pstmt.executeUpdate();
		f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	public static boolean insert2(A3 m) {
		boolean f = false;
		try {
		Connection con =A5.cr();
		String q = "insert into ele3(ename,ecost) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,m.getEname());
		pstmt.setString(2,m.getEcost());	
		pstmt.executeUpdate();
		f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	public static boolean insert3(A3 m) {
		boolean f = false;
		try {
		Connection con =A5.cr();
		String q = "insert into ele4(ename,ecost) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,m.getEname());
		pstmt.setString(2,m.getEcost());
		pstmt.executeUpdate();
		f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	
	public static boolean regin(A3 m) {
		boolean f = false;
		try {
		Connection con =A5.cr();
		String q = "insert into reg(ename,ecost) values(?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,m.getEname());
		pstmt.setString(2,m.getEcost());
		pstmt.executeUpdate();
		f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	public static void showall() {
		try {
		Connection con =A5.cr();
		String q = "select * from ele2;";
		java.sql.Statement stmt = con.createStatement(); 
		ResultSet set = stmt.executeQuery(q); 
		System.out.println("_______________________________________________");
		System.out.println(" S.NO                PRODUCTS             COST  ");
		System.out.println("_______________________________________________");
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
		 System.out.println("  "+id +"          "+name+"              "+phone+" ");
		}
		System.out.println("_______________________________________________");
		}
		catch(Exception e) {
			e.printStackTrace();
		}}
	
	
public static void showall2() {
		
		try {
		Connection con =A5.cr();
		String q = "select * from ele3;";
		java.sql.Statement stmt = con.createStatement(); 
		ResultSet set = stmt.executeQuery(q); 
		System.out.println("_______________________________________________");
		System.out.println(" S.NO             PRODUCTS               COST  ");
		System.out.println("_______________________________________________");
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
		 System.out.println("  "+id +"          "+name+"              "+phone+" ");
		}
		System.out.println("_______________________________________________");
		}
		catch(Exception e) {
			e.printStackTrace();
		}}
	
	
public static void showall3() {
	
	boolean f = false;
	try {
	Connection con =A5.cr();
	String q = "select * from ele4;";
	java.sql.Statement stmt = con.createStatement(); 
	ResultSet set = stmt.executeQuery(q); 
	System.out.println("________________________________________________");
	System.out.println(" S.NO              PRODUCTS               COST  ");
	System.out.println("________________________________________________");
	while(set.next()) {
		int id = set.getInt(1);
		String name = set.getString(2);
		String phone = set.getString(3);
	 System.out.println("  "+id +"          "+name+"              "+phone+" ");
	}
	 System.out.println("_______________________________________________");
	}
	catch(Exception e) {
		e.printStackTrace();
	}}
	
	public static boolean delete(int eid) {
		boolean f = false;
		try {
		Connection con =A5.cr();
		String q = "delete from ele2 where eid = ?";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(1,eid);
		pstmt.executeUpdate();
		String p = "SET @num := 0;";
		String p3 = "UPDATE ele2 SET eid = @num := (@num+1);";
		String p4 = "ALTER TABLE ele2 AUTO_INCREMENT = 1;";
        java.sql.Statement stmt = con.createStatement(); 
		stmt.execute(p);  
		stmt.execute(p3); 
		stmt.execute(p4); 
		f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean delete2(int eid) {
		boolean f = false;
		try {
		Connection con =A5.cr();
		String q = "delete from ele3 where eid = ?";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(1,eid);
		pstmt.executeUpdate();
	    String p = "SET @num := 0;";
		String p3 = "UPDATE ele3 SET eid = @num := (@num+1);";
		String p4 = "ALTER TABLE ele3 AUTO_INCREMENT = 1;";
        java.sql.Statement stmt = con.createStatement(); 
		stmt.execute(p);  
		stmt.execute(p3); 
		stmt.execute(p4);
		f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		}
	
	public static boolean delete3(int eid) {
		boolean f = false;
		try {
		Connection con =A5.cr();
		String q = "delete from ele4 where eid = ?";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(1,eid);
		pstmt.executeUpdate();
	    String p = "SET @num := 0;";
		String p3 = "UPDATE ele4 SET eid = @num := (@num+1);";
		String p4 = "ALTER TABLE ele4 AUTO_INCREMENT = 1;";
        java.sql.Statement stmt = con.createStatement(); 
		stmt.execute(p);  
		stmt.execute(p3); 
		stmt.execute(p4);
		f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static void login2() {
		try {
		Connection con =A5.cr();
		String q = "select * from reg;";
		java.sql.Statement stmt = con.createStatement(); 
		ResultSet set = stmt.executeQuery(q); 
		System.out.println("__________________________________________________________");
		System.out.println(" S.N                    PRODUCTS                    COST  ");
		System.out.println("__________________________________________________________");
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String phone = set.getString(3);
		 System.out.println("  "+id +"              "+name+"            "+phone+" ");
		}
		System.out.println("__________________________________________________________");
		}
		catch(Exception e) {
			e.printStackTrace();
		}}

}