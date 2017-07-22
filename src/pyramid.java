import java.util.Scanner;

public class pyramid {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    int n=z.nextInt();
    int t=6,x=t;
   
    
    for(int i=0;i<n;i++)
        {for(int k=0;k<n-i-1;k++)
            {System.out.print(" ");}
            for(int j=0;j<=i;j++)
            {if(j<i)System.out.print(String.format("%05d", t)+" ");
            else System.out.print(String.format("%05d", t));
            x=x+16;
            t=t+x;}
       System.out.println();
        }  
    }
}
