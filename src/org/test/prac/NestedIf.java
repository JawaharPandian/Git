package org.test.prac;

public class NestedIf {
	
	public static void main(String[] args) {
		
		int age=19,empId=80;
		if (age>18) {
			System.out.println("valid age");
			if (empId>90) {
				System.out.println("valid employee");
				
			}else {
				System.out.println("invalid employee");
			}
			
		}else {
			System.out.println("invalid age");
		}
	}

}
