import java.util.*;
public class binarysearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int n=sc.nextInt();
        int[] numbers=new int[n];
        int start=0;
        int end=n-1;
        

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key)
            {
                System.out.println("key found at index: "+mid);
                break;
            }

            else if(numbers[mid]<key){
                start=mid+1;
            }

            else if(numbers[mid]>key){
                end=mid-1;
            }

            else{
                System.out.println("key not found.");
            }
        }
        
        

    }
    
}
