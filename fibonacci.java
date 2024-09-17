import java.util.*;
public class fibonacci {
    public static void fibo(int n){
        int n1=0;
        int n2=1;

        System.out.print(n1 + " "+ n2);
        for(int i=2;i<n;i++){
            int sum=n1+n2;
            System.out.print(" "+ sum);
            n1=n2;
            n2=sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibo(n);
    }
}
