import java.util.*;
public class asciivalue {
    public static void asciival(char c){
        int asciiValue = c;  
        System.out.println("ASCII value of " +c+ " is: "+asciiValue);  
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        asciival(c);
    }
}
