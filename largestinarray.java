import java.util.*;
public class largestinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }
        
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i])
            {
                largest=numbers[i];
            }
        
            if(smallest>numbers[i])
            {
                smallest=numbers[i];
            }
        }

        System.out.println("the largest in array is: "+ largest);
        System.out.print("the smallest in array is: "+ smallest);

    }
    
}
