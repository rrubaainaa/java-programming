import java.util.Scanner;

public class revanarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];

        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }

        int first=0; 
        int last=numbers.length-1;

        while(first<last)
        {
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }
}