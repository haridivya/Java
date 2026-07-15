// 1343-Number of Sub-arrays of Size k and Average Greater than or Equal to Threshold
import java.util.Scanner;
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0;
        int window_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=arr[i];
        }
        if(window_sum/k>=threshold){
            res+=1;
        }
        for(int j=k;j<arr.length;j++){
            window_sum+=arr[j]-arr[j-k];
            if((window_sum/k)>=threshold){
                res+=1;
            }
        }
        return res;
    }
}
public class leetcode1343Problem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the k value : ");
        int k=sc.nextInt();
        System.out.print("Enter the Threshold value : ");
        int threshold=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.numOfSubarrays(arr,k,threshold));
    }
}
