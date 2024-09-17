import java.util.Scanner;

public class palindrome {
    public static void pali(int n){
        int orig=n;
        int temp=0;
        while(n>0){
            int r=n%10;
            temp=temp*10+r;
            n=n/10;
        }

        if(temp==orig){
            System.out.println("number is palindrome.");
        }
        else{
            System.out.println("number is not palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pali(n);
    }

}
