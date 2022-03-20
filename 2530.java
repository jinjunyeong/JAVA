import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int h = input.nextInt();
        int m = input.nextInt();
        int s= input.nextInt();
        int d = input.nextInt();
        
        System.out.println(((h+(m+(s+d)/60)/60)%24) + " " + ((m+(s+d)/60)%60) + " " + ((s+d)%60));
    }
}
