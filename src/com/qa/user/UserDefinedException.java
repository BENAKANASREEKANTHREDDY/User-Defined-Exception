package com.qa.user;


class NuvvuChinnaPillavadivi extends Exception{
	NuvvuChinnaPillavadivi(String s)
	{
		System.out.println(s);
	}
}

public class UserDefinedException {
	
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
		UserDefinedException obj = new 	UserDefinedException();
		try {
			obj.age(7);
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
}
