import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int D;
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		
		int a = ((((((D + C)/60)+ B)/60) + A) % 24);
		int b = ((((D + C)/ 60) + B) % 60);
		int c = (((D + C)% 60) );
		
		
			
		
		System.out.println(a + " " + b + " " + c);
				
		
		
		
		

	

}
}
