import java.util.*;

public class automorphic {
    public static void isAutomorphic(int n){
        int square = n * n;
        boolean isAutomorphic = true;
        
        while(n > 0) {
            if(n % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            n /= 10;
            square /= 10;
        }
        
        if(isAutomorphic) {
            System.out.println("The number is automorphic.");
        } else {
            System.out.println("The number is not automorphic.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        isAutomorphic(n);
    }
}

