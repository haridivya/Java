import java.util.*;
class containsDuplicates
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the Element : ");
            arr[i]=sc.nextInt();
        }
        Set<Integer> values=new HashSet<>();
        for(int i:arr)
        {
            values.add(i);
        }
        System.out.print(Arrays.toString(arr) +" "+ values);
        if(values.size()==arr.length){
            System.out.print("It does not contains duplicate Elements");
        }
        else{
            System.out.println("It Contains duplicate Elements");
        }
    }
}