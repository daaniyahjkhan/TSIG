public class armstrong {
    public static void main(String[] args) {
        //armstong number
        int i=1;
        int x=0;
        int r,s=0;
        for(i=1;i<=1000;i++)
        {
            x=i;
            s=0;
        while(x!=0)
        {
            r=x%10;
            s=s+(r*r*r);
           x=x/10;
        }
           if(s==i)
            {
                System.out.println(i);
            }    
        }
    }
}

