package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class A3 {
	
	private int eid;
	private String ename;
	private String ecost;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcost() {
		return ecost;
	}
	public void setEcost(String ecost) {
		this.ecost = ecost;
	}
	public A3() {
		super();
	}
	
	public A3( String ename, String ecost) {
	
		this.ename = ename;
		this.ecost = ecost;
	}

	
	public A3(int eid, String ename, String ecost) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecost = ecost;
	}

	
	
	
}
