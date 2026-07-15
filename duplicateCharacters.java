import java.util.*;
public class duplicateCharacters {
    public static void main(String args[]){
        Set<String> dup =new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String S=sc.next();
        for(int i=0;i<S.length();i++){
            char a=S.charAt(i);
            int count=0;
            for(int j=0;j<S.length();j++){
                if(a==S.charAt(j)){
                    count+=1;
                }
            }
            // System.out.println(count);
            if(count>1){
                dup.add(String.valueOf(a));
            }

        }
        if(dup.size()>=1){
            System.out.println("Duplicate Character in String : "+ dup);
        }
        else{
        System.out.println("No Duplicate Characters in the given String");
        }
    }
}
