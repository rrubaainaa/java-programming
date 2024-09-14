import java.util.*;
public class advpatterns {
    public static void hollowrect(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.print("\n");
        }
    }

    public static void rotatedandinvertedhalfpyramid(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    public static void invertedpyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.err.println();
        }
    }

    public static void floydtriangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.print("\n");
        }
    }

    public static void onezerotriangle(int n)
    {
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }

            for(int j=0;j<=i;j++)
            {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }

        else{
            for(int j=1;j<=2*n-i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*n-(2*(2*n-i));j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*n-i;j++){
                System.out.print("*");
            }
        }

        System.out.println();
    }
    }

    public static void solidrhombus(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollowrhombus(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++)
            {
                if(i==0 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
            }
            System.out.println();
            
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int r=sc.nextInt();
        //int c=sc.nextInt();

        //hollowrect(r,c);
        //rotatedandinvertedhalfpyramid(5);
        //invertedpyramid(5);
        //floydtriangle(5);
        //onezerotriangle(4);
        //butterfly(5);
        //solidrhombus(5);
        //hollowrhombus(5);
        //diamond(4);
    }
}
