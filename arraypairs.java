import java.util.*;
public class arraypairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []numbers=new int[n];

        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }
}
