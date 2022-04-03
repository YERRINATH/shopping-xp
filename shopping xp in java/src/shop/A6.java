package shop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class A6 extends A1{
	static int x=0;
	static HashMap<String, Integer> p = new HashMap<String, Integer>();
	static ArrayList<String> c1 = new ArrayList<String>();
	static ArrayList<Integer> c2 = new ArrayList<Integer>();
	static ArrayList<String> c3 = new ArrayList<String>();
	static ArrayList<Integer> c4 = new ArrayList<Integer>();
	static ArrayList<String> c5 = new ArrayList<String>();
	static ArrayList<Integer> c6 = new ArrayList<Integer>();
	public static void select1(int eid) {	
		Scanner Sc = new Scanner(System.in);
		try {
			Connection con =A5.cr();
			String q = "select * from ele2;";
			java.sql.Statement stmt = con.createStatement(); 
			ResultSet set = stmt.executeQuery(q); 
			while(set.next()) {
				String name = set.getString(2);
				Integer phone = set.getInt(3);
				 c1.add(name); 
				 c2.add(phone);
			}
			int n = eid - 1;
			 p.put(c1.get(n),c2.get(n));
			 System.out.println("If You Want To Add Items Click 1 \n Else Click 2");
			 int P = Sc.nextInt();
			 if (P == 1) {
				A1.c(); 
			 }else {
				 A6.cal();
					A6.pay(); 
					A6.otp();
					A6.order();	 
			 }
		}	
			catch(Exception e) {
				e.printStackTrace();
			}}
	
	public static void select2(int eid) {
		Scanner Sc = new Scanner(System.in);
		try {
			Connection con =A5.cr();
			String q = "select * from ele3;";
			java.sql.Statement stmt = con.createStatement(); 
			ResultSet set = stmt.executeQuery(q); 
			while(set.next()) {
				String name = set.getString(2);
				Integer phone = set.getInt(3);
				 c3.add(name); 
				 c4.add(phone);
			}
			int n = eid - 1;
			 p.put(c3.get(n),c4.get(n));
			 System.out.println("If You Want To Add Items Click 1 \n Else Click 2");
			 int P = Sc.nextInt();
			 if (P == 1) {
				A1.c(); 
			 }else {
				 A6.cal();
					A6.pay(); 
					A6.otp();
					A6.order();	 
			 }
		}
		catch(Exception e) {
				e.printStackTrace();
			}}
	
	public static void select3(int eid) {
		Scanner Sc = new Scanner(System.in);
		try {
			Connection con =A5.cr();
			String q = "select * from ele4;";
			java.sql.Statement stmt = con.createStatement(); 
			ResultSet set = stmt.executeQuery(q); 
			while(set.next()) {
				String name = set.getString(2);
				Integer phone = set.getInt(3);
				 c5.add(name); 
				 c6.add(phone);
			}
			int n = eid - 1;
			 p.put(c5.get(n),c6.get(n));
			 System.out.println("If You Want To Add Items Click 1 \n Else Click 2");
			 int P = Sc.nextInt();
			 if (P == 1) {
				A1.c(); 
			 }else {
				 A6.cal();
					A6.pay(); 
					A6.otp();
					A6.order();	 
			 }
		}
		catch(Exception e) {
				e.printStackTrace();
			}}
	
public static void pay() {   
		Scanner o = new Scanner(System.in);
		int a=1,l,c;
		 System.out.println("Amount of your product is : " +x);
		 do {
		 System.out.println("PAYMENT OPTIONS\n\n");
     	 System.out.println("1.GOOGLE PAY\n2.PHONE PAY\n3.Paytm\n");
     	 a = o.nextInt();
     	 if(a<3) { 		
     	 }
      else {
     		 System.out.println("enter from given PAYMENTS only\n");
     		 continue;
      }
		 }
		while(a>3); {
		}
		 do {
		 c=x;
         System.out.println("YOUR AMOUNT IS \n"+x);
         System.out.println("\n\nPAY THE AMOUNT\n");
         Scanner k=new Scanner(System.in);
         l=k.nextInt();
         if(l == x) {}
         else {
        	 System.out.println("enter correct AMOUNT\n");
        	 continue;
         }
		 }
         while(l < c || l > c);
         
}

public static   void otp() { 
	 int m,p,o;
	 int n=11111;
do {	
    System.out.println("Generating OTP\n" );
    m=(int) (n*Math.random()+12*Math.random());
    o = m ;
    System.out.println("generated otp is \n" + o);
    Scanner k = new Scanner(System.in);
    p=k.nextInt();
    if(p == o) {}
    else {
   	 System.out.println("enter correct OTP \n");
   	 continue;
    }
	 }
    while(p < o || p > o);
}

public static void order() {
System.out.println(" AMOUNT PAID SUCCESSFULLY \n");
System.out.println("your order will be delivered within next 5 days\n");
System.out.println("\t\t********************************************\n");
System.out.println("\t\t  YOU SUCCESSFULLY BOOKED YOUR PRODUCTS\n");
System.out.println("\t\t********************************************\n");	
}

	public static void cal() {
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println("Products In Your Cart ");
		for (String i : p.keySet()) {
			 System.out.println("PRODUCTS : "+i +"  COST : "+p.get(i));
			 x = x + p.get(i);
		}
		System.out.println("*************************************************************");
	}

	
}