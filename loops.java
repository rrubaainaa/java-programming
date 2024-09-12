import java.util.*;
public class loops {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    /*int n=sc.nextInt();

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }*/

    //int n=sc.nextInt();
    
    /*while(n>0)
    {
        int rev=n%10;
        System.out.print(rev);
        n/=10;
    }*/
    /*     int rev=0;
    while(n>0)
    {
        int lastdigit=n%10;
        rev=(rev*10)+lastdigit;
        n/=10;
    }
    System.out.print(rev);*/
   
   
   /*  int counter=1;
    do{
        System.out.println(counter);
        counter++;
    }while(counter<=10);*/

   /*  for(int i=1;i<=5;i++)
    {
        if(i==3)
        continue;

        System.out.println(i);
    }*/

    /*do{
        System.out.println("enter number: ");
        int n=sc.nextInt();
        if(n%10==0)
        continue;

        System.out.println(n);
    }while(true);*/

    int n=sc.nextInt();
    boolean isprime=true;
      


    for(int i=2;i<=n-1;i++)
    {
        if(n%i==0)
        isprime=false;
    }

    if(isprime==true)
    {
        System.out.println("n is prime.");
    }
    else{
        System.out.println("n is not prime.");
    }
    }
}
