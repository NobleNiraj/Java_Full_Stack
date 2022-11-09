
public class MinOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Minimum of the three number
		// using the ternary operator
		int a, b, c;
		a = 5 ;
		b = 10;
		c = 10;
		
		int result  = (a<b)? (a<c?a:c) : (b<c?b:c);
		
		System.out.println("result "+ result);
		
		// second method
		int num1 = a;
		int num2 = b;
		int num3 = c;
		if(num1 < num2){
			if(num1 < num3){
				System.out.println(num1);
			}
		}else if (num2< num3) {
			System.out.println(num2);
		}else{
			System.out.println(num3);
		}


	}

}
