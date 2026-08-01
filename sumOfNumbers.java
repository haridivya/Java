import java.util.*;
class Main{
    public static int sum(int n){
        if(n==1){
            return n;
        }
        return sum(n-1)+n;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n=sc.nextInt();
    System.out.println("Sum of N Natural Numbers "+sum(n));
    }
}