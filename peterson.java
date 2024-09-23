import java.util.*;
public class peterson {
    public static int isfact(int r){
        int fact=1;

        for(int i=1;i<=r;i++)
        {
            fact*=i;
        }

        return fact;
    }
    public static void ispeterson(int n){
        int orig=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=isfact(r);;
            n/=10;
        }

        if(sum==orig)
        {
            System.out.println("the number is peterson.");
        }
        else{
            System.out.println("the number is not peterson.");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ispeterson(n);
    }
}
