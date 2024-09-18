import java.util.*;
public class armstrong {
    public static void arm(int n){
        int temp=0;
        int orig=n;
        while(n>0){
            int r=n%10;
            temp+=(r*r*r);
            n=n/10;
        }

        if(temp==orig){
            System.out.print("the number is armstrong.");
        }
        else{
            System.out.print("the number is not armstrong.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arm(n);
    }
}
