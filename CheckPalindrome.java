import java.util.*;
public class CheckPalindrome {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String S=scan.next();
        S=S.toLowerCase();
        String temp="";
        for(int i=S.length()-1;i>-1;i--)
        {
            temp+=S.charAt(i);
        }
        if(S.equals(temp)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
