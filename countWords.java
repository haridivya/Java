import java.util.*;
public class countWords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int word=0;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c==' '){
                word+=1;

            }
        }
        word+=1;
        System.out.println("Words in given String :"+ word);
    }
}
