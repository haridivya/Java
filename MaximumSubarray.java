import java.util.*;
class Solution {
    public int findMaxSubArray(int[] nums, int k) {
        int window_sum=0;
        int max_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=nums[i];
        }
        max_sum=window_sum;
        for(int j=k;j<nums.length;j++){
            window_sum+=nums[j]-nums[j-k];
            if(window_sum>max_sum){
                max_sum=window_sum;
            }
        }
        return max_sum;
    }
}
class MaximumSubarray {
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
        Solution obj=new Solution();
        System.out.println(obj.findMaxSubArray(arr,k));
        
    }
}
