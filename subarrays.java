import java.util.Scanner;

public class subarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];

        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            
        }
    }
}
