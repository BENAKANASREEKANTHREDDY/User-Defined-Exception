package com.qa.user;


class NuvvuChinnaPillavadivi extends Exception{
	NuvvuChinnaPillavadivi(String s)
	{
		System.out.println(s);
	}
}

public class UserDefinedException2 {
	
	private String s;
	private String x;

	void age(int age) throws NuvvuChinnaPillavadivi{
	if(age<18) {
		throw new NuvvuChinnaPillavadivi ("age is not sufficient!:" + s );
	}
	else
	{
		System.out.println("you can vote!" + x);
	}
	}
	public static void main(String[] args) {
		UserDefinedException2 obj = new 	UserDefinedException2();
		try {
			obj.age(7);
		} catch (Exception e) {
			System.out.println(e);
			System.err.println("tjis is the final output");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}
