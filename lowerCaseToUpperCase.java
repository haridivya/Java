import java.util.*;
public class lowerCaseToUpperCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String S = sc.nextLine();
        String result="";
        for(int i=0;i<S.length();i++)
        {
            char a = S.charAt(i);
            int b = (int) a;
            int Ascii = b-32;
            result+=(char) Ascii;

        }
        System.out.println("Convert Lower case into UpperCase : "+result);
    }
}
