import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        int n=sc.nextInt();
        int[] numbers=new int[n];
        int flag=0;

        for(int j=0;j<n;j++)
        {
            numbers[j]=sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                flag=1;
                System.out.print("the key is found at " + i);
            }
        }
        if(flag==0)
        {
            System.out.print("key not found");
        }
    }
    
}
