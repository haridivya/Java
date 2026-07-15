import java.util.*;
public class Even_odd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Value : ");
        int value=sc.nextInt();
        int result=value & 1;
        if(result==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
