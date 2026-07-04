import java.util.*;
public class squaresOfSortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int x=0;
        int y=n-1;
        if(nums.length%2==0)
        {
            while(x<y)
            {
            nums[x]=nums[x]*nums[x];
            nums[y]=nums[y]*nums[y];
            x++;
            y--;
            }
            System.out.println(Arrays.toString(nums));
        }
        else{
            while(x<=y)
            {
            if(x==y)
            {
                nums[x]=nums[x]*nums[x];
            }
            else
            {
                nums[x]=nums[x]*nums[x];
                nums[y]=nums[y]*nums[y];
            }
            x++;
            y--;
            }
            System.out.println(Arrays.toString(nums));
        }
        

    }
}
