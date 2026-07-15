import java.util.*;
public class removeDuplicates {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        for(int end=1;end<n;end++){
            if(arr[start]!=arr[end]){
                start++;
                arr[start]=arr[end];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,start+1)));
    }
}
