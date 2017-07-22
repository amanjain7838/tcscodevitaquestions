import java.math.BigInteger;
import java.util.Scanner;
public class combinatric {
public static void main(String args[])
{    Scanner z=new Scanner(System.in);
    BigInteger N=z.nextBigInteger();
    BigInteger K=z.nextBigInteger();
    
    BigInteger answer=BigInteger.ZERO;
    try{
        
        BigInteger k=BigInteger.ZERO;
BigInteger value = BigInteger.ONE;

answer=answer.add(value);

         //System.out.println(answer +"at"+"-->"+k);
   value= value.multiply((N.subtract(k)))
                 .divide((k.add(BigInteger.ONE)));
      k=k.add(BigInteger.ONE);
       value= value.multiply((N.subtract(k)))
                 .divide((k.add(BigInteger.ONE)));
      k=k.add(BigInteger.ONE);
        
         for(k=k;k.compareTo(N)<=0;k=k.add(BigInteger.ONE))
     {  if(k.compareTo(K)>0)
        {break;}
         if(k.mod(BigInteger.valueOf(2))==BigInteger.ZERO&& k.compareTo(K)<=0)
         {answer=answer.add(value);
        // System.out.println(answer +"at"+"-->"+k);
         }
      //   else System.out.println("skipping at"+k);
//BigInteger temp=N.subtract(k);
        value= value.multiply((N.subtract(k)))
                 .divide((k.add(BigInteger.ONE)));
      k=k.add(BigInteger.ONE);
       value= value.multiply((N.subtract(k)))
                 .divide((k.add(BigInteger.ONE)));
        
        
            }
    System.out.println(answer);
}catch(Exception e)
    {e.printStackTrace();}
}}
    

