package com.sbi.loans.homeloans;

public class ChildClass extends ThirdProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();
		

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 overridein childClass");
		
	}

}
