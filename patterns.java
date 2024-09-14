import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.err.print(j);
            }
            System.out.print("\n");
        }*/
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
