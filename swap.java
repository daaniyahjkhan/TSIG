import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("reversed numebrs: a= "+a+ " b= "+b);
    }
}
