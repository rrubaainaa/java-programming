import java.util.Scanner;

public class subarrayoperations {
    public static void maxssum(int numbers[]){
        int currsum=0;
        int maxssum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxssum<currsum){
                    maxssum=currsum;
                }
            }
            
        }
        System.out.println("max sum is:"+ maxssum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];

        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }

        maxssum(numbers);
    }
}
