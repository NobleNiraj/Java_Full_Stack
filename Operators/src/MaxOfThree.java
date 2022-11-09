import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we have to Write a program to write find the max of three numbers
		int num1, num2, num3;  
		Scanner in = new Scanner(System.in);
		num1=in.nextInt();  
		num2=in.nextInt();  
		num3=in.nextInt();  
		if (num1 >= num2 && num1 >= num3)  
			System.out.println("The largest number is: "+num1);  
		else if (num2 >= num1 && num2 >= num3)  
			System.out.println("The largest number is: "+num2);  
		else 
			System.out.println("The largest number is: "+num3); 
		
		in.close();
		
		// we can also do this problem using the ternary operator
		/*
		 * there are 3 variable a , b, c 
		 * to chose the max from 2 values
		 * int temp = a>b?a:b
		 * the outcome of the above equation determine the max between the a , b
		 * now we can pitch the max value against the c
		 * temp>c? temp : c;
		 */
		
		int result = (num1>num2?num1:num2)>num3 ? (num1>num2?num1:num2): num3;
		

		
		System.out.println("result " + result);
		
		
		// third method
		int max = 0 ;
		String maxChar;
		if(num1>num2) {
			max = num1;
			maxChar = "num1" ;
		}else {
			max = num2;
			maxChar = "num2";
		}
		if (num3 > max) {
			max = num3;
			maxChar = "num3";
		}
		
		System.out.println(max);
		 
		

	}

}
