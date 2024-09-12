import java.util.*;

public class functions {
    /*public static int prod(int a,int b){
        int product=a*b;
        return product;
    }*/

    public static int fact(int n){
        int f=1;

        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }

    public static boolean isprime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n==2)
            {
                return true;
            }
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void primesinrange (int n){
        for(int i=2;i<=n;i++)
        {
            if (isprime(i)==true)
            {
                System.out.println(i);
            }
        }
        
    }

    public static void bintodec(int binnum){
        int pow=0;
        int decnum=0;

        while(binnum>0){
            int lastdig=binnum%10;
            decnum=decnum+(lastdig*(int)(Math.pow(2,pow)));
            pow++;
            binnum/=10;
            
        }
        System.out.println(decnum);
    }

    public static void dectobin(int  decnum){
        int pow=0;
        int binnum=0;

        while(decnum>0){
            int lastdig=decnum%2;
            binnum=binnum+(lastdig*(int)(Math.pow(10,pow)));
            pow++;
            decnum/=2;
            
        }
        System.out.println(binnum);
    }

    public static void sumofdig(int num){
        int sum=0;
        while(num>0)
        {
            int lastdig=num%10;
            sum+=lastdig;
            num/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int a= sc.nextInt();
        //int b=sc.nextInt();

        //int mult=prod(a,b);
        //System.out.print(mult);

        /*int n=sc.nextInt();
        int facto=fact(n);
        System.out.print(facto);*/

        //primesinrange(10);

        //bintodec(1010);
        //dectobin(10);
        sumofdig(1234);
        
    }
    
}
