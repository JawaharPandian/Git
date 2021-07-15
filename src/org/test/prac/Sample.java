package org.test.prac;

public class Sample {
	
	public static void main(String[] args) {
		
		int a=2;
		
		switch (a) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			
		case 3:
			System.out.println("Wednesday");
			
		case 4:
			System.out.println("Thursday");
			
		case 5:
			System.out.println("Friday");
			
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}
	}
		
//		//		1		 2		4
//		for (int i = 0; i < 3; i++) {
//			//			a	  b		d
//			for (int j = 0; j < 3; j++) {
//				//	c
//				System.out.println(j);
//			}
//			//		3
//			System.out.println(i);
//		}
//	}
		
//		for (int i = 0; i < 10; i++) {
//			
//			if (i==5) {
//				continue;//Skip the current iteration
//			}
//			System.out.println(i);
//		}
//		
//		System.out.println("Outside for loop...");
//	}
}	

		
		

