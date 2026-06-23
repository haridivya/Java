import java.util.*;
public class reverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            char temp1=s.charAt(i);
            temp+=temp1;
        }
        System.out.println("String Before : "+s);
        System.out.println("String After : "+temp);
        
    }
}
