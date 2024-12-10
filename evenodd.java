import java.util.Scanner;
public class evenodd {
    public static void main(String args[])
    {
        System.out.println("enter a num:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();

    int r=0;
    int e=0;
    int o=0;
    while (a!=0)
    {
        r=a%10;
        if (r%2==0){
                e++;
            }       
        else {
                o++;
        }
     a=a/10;
    }
    System.out.println("no of even digits:"+e);
    System.out.println("no of odd digits:"+o);

}
}