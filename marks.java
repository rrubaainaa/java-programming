import java.util.*;
public class marks {
   public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int marks=sc.nextInt();

    if(marks>=33)
    {
        System.out.println("pass");
    }

    else{
        System.out.println("fail");
    }
   }
}
