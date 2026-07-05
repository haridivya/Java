import java.util.*;
public class validPalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char f=s.charAt(left);
            char l=s.charAt(right);
            int f1=f;
            int l1=l;
            if((f1>=65 && f1<=122) && (l1>=65 && l1<=122)){
                if(f!=l){
                    System.out.println("Not Palindrome");
                }
                left++;
                right--;
            }
            else{
                if(f1<65 || f1>122){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        System.out.println("Palindrome");

    }
}
