import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        S=S.toLowerCase();
        int s=0;
        int e=S.length()-1;
        int temp=1;
        while(s<e){
            if(S.charAt(s)!=S.charAt(e)){
                temp=0;
                break;
            }
            s++;
            e--;
        }
        if(temp==1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
