import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==1){
            return n;
        }
        return fact(n-1)*n;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=sc.nextInt();
    System.out.println("Factorial of N Numbers "+fact(n));
    }
}


