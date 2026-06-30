import java.util.*;
public class reverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        StringBuffer s=new StringBuffer(S);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char t=s.charAt(start);
            s.setCharAt(start,s.charAt(end));
            s.setCharAt(end,t);
            start++;
            end--;
        }
        System.out.println(s);
    }
}
