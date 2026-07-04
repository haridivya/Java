import java.util.*;
public class moveZeros {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int j=0;
        for(int z=0;z<nums.length;z++)
        {
            if(nums[z]!=0){
                int val=nums[j];
                nums[j]=nums[z];
                j++;
                nums[z]=val;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
