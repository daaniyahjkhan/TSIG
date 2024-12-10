import java.util.Scanner;
public class fact {
    public static void main(String args[]){
        System.out.println("enter a num:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i;
    int f=1;
    System.out.println("the numebr is:"+n);
    for(i=1;i<=n;i++)
    {
        f=f*i;
    }
    System.out.println("factorial is :"+f);
}
}