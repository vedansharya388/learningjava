import java.util.Scanner;
public class friendly
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0;
        System.out.println("enter a number");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        if(s%9==0)
        {
            System.out.println("its friendly number");
        }
        else
        {
            System.out.println("not friendly number");
        }
    }
}
