import java.util.Scanner;
public class greattestCommonDIviosr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Greatest Common Divisor a and b = " +gcd(a,b));
    }
    public static int gcd(int a, int b) {
        if(a==0 || b==0)
            System.out.println("No greatest common factor");
        while (a!=b) {
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
}
