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
		
		int a = (((((D/60)+ C)/60) + A) % 24);
		int b = ((D / 60) + B);
		int c = ((D % 60) + C);
		
		if(c>60){
			b = (b + 1);
			c = (c -60);
			if(b>60) {
				a = (a + 1);
				b = (b - 60);
			
			
		}
			else {
				a = (((((D/60)+ C)/60) + A)% 24);
				b = ((D / 60) + B + 1);
				c = ((D % 60) + C -60);
			}
		}
		else {
			a = (((((D/60)+ C)/60) + A)% 24);
			b = ((D / 60) + B);
			c = ((D % 60) + C);
			
			
		}
		System.out.println(a + " " + b + " " + c);
				
		
		
		
		

	

}
}
