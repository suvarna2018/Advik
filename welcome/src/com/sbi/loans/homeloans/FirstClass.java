package com.sbi.loans.homeloans;

public class FirstClass implements SecondProject {
	
	int a=2,b=4, c=0;
	public void addition()
	{
		c=a+b;
		System.out.println("addtion of a & b is:"+c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass obj=new FirstClass();
		obj.addition();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.division();
				

	}


	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("division overridein SecondProject");
		
	}

}
