package firstProject;

import java.util.Scanner;

public class calculate implements interfaceDemo {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		Integer c = a + b;
		return c;
	}

	@Override
	public Integer subtract(Integer a, Integer b) {
		// TODO Auto-generated method stub
		Integer c = a - b;
		return c;
	}

	@Override
	public Integer multiply(Integer a, Integer b) {
		// TODO Auto-generated method stub
		Integer c = a * b;
		return c ;
	}

	@Override
	public Integer divide(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a / b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate c = new calculate();
		Scanner sc = new Scanner(System.in);
		Integer a, b, r, i;
		
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Enter your selection :\n 1) addition \n 2) subtraction \n 3) multiplication \n 4) division");
		i = sc.nextInt();
		switch(i) {
			case 1:
				r = c.add(a, b);
				System.out.println("result = " + r);
				break;
			case 2:
				r = c.subtract(a, b);
				System.out.println("result = " + r);
				break;
			case 3:
				r = c.multiply(a, b);
				System.out.println("result = " + r);
				break;
			case 4:
				if(b != 0) {
					r = c.divide(a, b);
					System.out.println("result = " + r);
				}
				else
					System.out.println("second factor is 0");
				break;	
			default:
				System.out.println("Invalid Entry");
		}
		
	}

}
