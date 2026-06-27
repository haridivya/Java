import java.util.*;
public class countVowelConsonants {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        S=S.toLowerCase();
        int vowelsCount=0;
        int consonantsCount=0;
        for(int i=0;i<S.length();i++){
            char t=S.charAt(i);
            if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u'){
                vowelsCount+=1;
            }
            else{
                consonantsCount+=1;
            }
        }
        System.out.println("The Count of Vowels is : "+vowelsCount);
        System.out.println("The Count of Consonants is : "+consonantsCount);
        
    }
}
