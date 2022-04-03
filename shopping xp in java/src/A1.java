import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import shop.A2;
import shop.A3;
import shop.A4;
import shop.A5;
import shop.A6;

public class A1 {
static int a;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException, SQLException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("******WELCOME******\n");
		System.out.println("1.ADMIN");
		System.out.println("2.LOGIN");
		System.out.println("3.REGISTER");
		System.out.println("4.EXIT");
		
		int i = sc.nextInt();
		
		switch(i) {
		case 1:{
			
			System.out.println("Enter Login Details\n");
			st();
			
			while(true) {
			System.out.println("\n******LOGIN WAS SUCCESSFUL******\n");
			System.out.println("1.ADD PRODUCT ");
			System.out.println("2.DELETE PRODUCT ");
			System.out.println("3.DISPLAY PRODUCTS");
			System.out.println("4.LOGOUT");
			
			int I = sc.nextInt();
			if(I == 1) {
				while(true) {
				System.out.println("select the catagory");
				System.out.println("1.electronics");
				System.out.println("2.KIDS STORE");
				System.out.println("3.DAILY PRODUCTS");
				
				int z = sc.nextInt();
				switch(z) {
				case 1:{
					
					ele2();
				}break;
				case 2:{
					
					ele3();
				}break;
				case 3:{
					
					ele4();
				}break;
				case 4:{break;}
				
				default:System.out.println("\nenter correct choose\n");
				}
				}
				
			}
			else if(I == 2) {
				
				while(true) {
					System.out.println("select the catagory");
					System.out.println("1.electronics");
					System.out.println("2.KIDS STORE");
					System.out.println("3.DAILY PRODUCTS");
					
					int z = sc.nextInt();
					switch(z) {
					case 1:{
						System.out.println("work1");
						del1();
					}break;
					case 2:{
						System.out.println("work2");
						del2();
					}break;
					case 3:{
						System.out.println("work3");
						del3();
					}break;
					case 4:{break;}
					
					default:System.out.println("\nenter correct choose\n");
					}
					}
				
				
				
			}
				
			else if(I == 3) {
				while(true) {
					System.out.println("select the catagory");
					System.out.println("1.electronics");
					System.out.println("2.KIDS STORE");
					System.out.println("3.DAILY PRODUCTS");
					System.out.println("4.TO QUIT");
					
					int z = sc.nextInt();
					switch(z) {
					case 1:{
						A4.showall();
					}break;
					case 2:{
						A4.showall2();
					}break;
					case 3:{
						A4.showall3();
					}break;
					case 4:{break;}
					
					default:System.out.println("\nEnter Correct Choose\n");
					}}}
			
			else if(I == 4) {
				break;
			}
			
			else {
				System.out.println("\nEnter Correct Choose\n");
			}}
				
		}
		break;
		case 2:{
			
			check();
			
			
			c();
			
			
			
			
		}break;
		
		case 3:{
			
			System.out.println("FIRST NAME : ");
			String name1=br.readLine();
			System.out.println("LAST NAME : ");
			String name2=br.readLine();
			System.out.println("USERNAME : ");
			String name=br.readLine();
			System.out.println("PASSWORD : ");
			String phone=br.readLine();

			A3 m = new A3(name,phone);
			boolean ans = A4.regin(m);
			if (ans==true) {
				System.out.println("reg insert worked");
				A4.showall();
			
			}
			else {
				System.out.println("something went wrong");
			}
			
		}break;
		
		case 4:{
			
			
			break;
			
			
		}
		}
		
		
	}
		public static void login() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("USERNAME :- ");
		String us = Sc.nextLine();
		System.out.println("PASSWORD :- ");
		String pa = Sc.nextLine();
		A2 myObj = new A2();
		myObj.setName1("YERRINATH");
		myObj.setName("REDDY");
	
		if(us.equals(myObj.getName1()) && pa.equals(myObj.getName())) {
			a=1;
		}
		else {
			System.out.println("\n\nsome thing went wrong");
		}

	}
		
		static void st() {
			while(true) {
			A1 R1 = new A1();
			R1.login();
			if(R1.a==1) {
				break;
			}
			else {
				
			}}}
		
		
public static void check() throws IOException { 
	boolean f = false;
		while(!(f == true)) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("USERNAME : ");
			String name1=br.readLine();
			System.out.println("PASSWORD : ");
			String pass1=br.readLine();
				try {
				Connection con =A5.cr();
				String q = "select * from reg;";
				
				java.sql.Statement stmt = con.createStatement(); 
				ResultSet set = stmt.executeQuery(q); 

				while(set.next()) {
					//int id = set.getInt(1);
					String name = set.getString(2);
					String phone = set.getString(3);
		
				 if(name1.contentEquals(set.getString(2)) && pass1.contentEquals(set.getString(3))) {
					 f = true;
					 System.out.println("Select From Below You Like To Buy");
						 }
				 else {
					 //System.out.println("try again....\n");
				 }
				 }
				}
				catch(Exception e) {
					e.printStackTrace();
				}}
		}


public static void ele2() throws IOException{	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("PRODUCTS : ");
	String name=br.readLine();
	System.out.println("COST : ");
	String phone=br.readLine();

	A3 m = new A3(name,phone);
	boolean ans = A4.insert(m);
	if (ans==true) {
		System.out.println("Successfully Product Inserted in Electronics");
	}
	else {
		System.out.println("something went wrong");
	}
	System.out.println(m);
}


public static void ele3() throws IOException{	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("PRODUCTS : ");
	String name=br.readLine();
	System.out.println("COST : ");
	String phone=br.readLine();

	A3 m = new A3(name,phone);
	boolean ans = A4.insert2(m);
	if (ans==true) {
		System.out.println("Successfully Product Inserted in Kids Store");
	}
	else {
		System.out.println("something went wrong");
	}
	System.out.println(m);
}



public static void ele4() throws IOException{	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("PRODUCTS : ");
	String name=br.readLine();
	System.out.println("COST : ");
	String phone=br.readLine();

	A3 m = new A3(name,phone);
	boolean ans = A4.insert3(m);
	if (ans==true) {
		System.out.println("Successfully Product Inserted in Daily Products");
	}
	else {
		System.out.println("something went wrong");
	}
	System.out.println(m);
}



public static void del1() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("select s.no from given list you like to delete ");
A4.showall();
System.out.println("enter id to delete");
int sid= Integer.parseInt(br.readLine());
boolean f = A4.delete(sid);
if(f) {
	System.out.println("Successfully Deleted from Electronics");
}
else {
	System.out.println("something went wrong...\n");
	System.out.println("try again...");
}
}



public static void del2() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("select s.no from given list you like to delete ");
A4.showall2();
System.out.println("enter id to delete");
int sid= Integer.parseInt(br.readLine());
boolean f = A4.delete2(sid);
if(f) {
	System.out.println("Successfully Deleted from Kids Store");
}
else {
	System.out.println("something went wrong...\n");
	System.out.println("try again...");
}
}




public static void del3() throws IOException{

System.out.println("select s.no from given list you like to delete ");
A4.showall3();
System.out.println("enter id to delete");
int sid= Integer.parseInt(br.readLine());
boolean f = A4.delete3(sid);
if(f) {
	System.out.println("Successfully Deleted from Daily Products");
}
else {
	System.out.println("something went wrong...\n");
	System.out.println("try again...");
}}



public static void sell1() throws NumberFormatException, IOException {
	System.out.println("SELECT Product You Like To BUY");
	int sid= Integer.parseInt(br.readLine());
	A6.select1(sid);
}


public static void sell2() throws NumberFormatException, IOException {
	System.out.println("SELECT Product You Like To BUY");
	int sid= Integer.parseInt(br.readLine());
	A6.select2(sid);
}

public static void sell3() throws NumberFormatException, IOException {
	System.out.println("SELECT Product You Like To BUY");
	int sid= Integer.parseInt(br.readLine());
	A6.select3(sid);
}

public static void c() {
	System.out.println("select the catagory");
	System.out.println("1.electronics");
	System.out.println("2.KIDS STORE");
	System.out.println("3.DAILY PRODUCTS");
	System.out.println("4.TO QUIT");
	Scanner Sc = new Scanner(System.in);
	int z = Sc.nextInt();
	switch(z) {
	case 1:{
		A4.showall();
		int x = Sc.nextInt();
		A6.select1(x);
	}break;
	case 2:{
		A4.showall2();
		int x = Sc.nextInt();
		A6.select2(x);
	}break;
	case 3:{
		A4.showall3();
		int x = Sc.nextInt();
		A6.select3(z);
		
	}break;
	case 4:{break;}
	
	default:System.out.println("\nEnter Correct Choose\n");
	}}


}