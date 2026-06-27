import java.util.*;
public class removeSpace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String result="";
        for(int i=0;i<S.length();i++){
            char temp=S.charAt(i);
            if(temp==' '){
                // skip spaces
            } else {
                result += temp;
            }
        }
        System.out.println(result);
    }
}
