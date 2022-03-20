import java.util.Scanner;
2
​
3
public class Main {
4
​
5
    public static void main(String[] args) {
6
        // TODO Auto-generated method stub
7
        Scanner input = new Scanner(System.in);
8
        
9
        int H;
10
        H = input.nextInt();
11
        
12
        int M;
13
        M = input.nextInt();
14
        
15
        if(M<45) {
16
            M = (M + 15);
17
            if(H == 0) {
18
                H = 23;
19
            }
20
            else {
21
                H = (H - 1);
22
            }
23
            
24
        }
25
        else {
26
            M = M-45;
27
        }
28
        System.out.println(H + " " + M);
29
        
30
​
31
    }
32
​
33
}
