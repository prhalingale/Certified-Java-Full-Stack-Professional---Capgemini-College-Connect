package com.array;

class Employee{
	int eid;
	String ename;

	public Employee() {
		
	}
	public Employee(Employee e) {
		super();
		this.eid=e.eid;
		this.ename=e.ename;
		
	}
	

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}


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


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub12
		
		Employee eob = new Employee();
		eob.setEid(10);
		eob.setEname("Poonam");
		
		Employee eob1= new Employee(eob);
		System.out.println("eob1="+eob1);
		//eob1= eob;
		
		System.out.println(eob1);
        System.out.println(eob);		
		
		
		
		System.out.println("ID="+eob.getEid());
		System.out.println("Name="+eob.getEname());

	}

}
//https://www.scientecheasy.com/2018/07/core-java-tutorial.html/