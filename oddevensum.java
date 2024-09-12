import java.util.*;
public class oddevensum {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        
         int num;
         int choice;
         int oddsum=0;
         int evensum=0;

         do{
            System.out.print("enter the number: ");
            num=sc.nextInt();

            if(num%2==0)
            {
                evensum+=num;
            }

            else{
                oddsum+=num;
            }

            choice=sc.nextInt();
         }while (choice==1);

         System.out.println("the odd integers sum is: "+ oddsum);
         System.out.println("the even integers sum is: "+ evensum);
    }
}
