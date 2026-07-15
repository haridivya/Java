import java.util.*;
public class mergeArrayList 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter the Size of Array 1 : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr1.add(sc.nextInt());
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter the Size of Array 2 : ");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++)
        {
            arr2.add(sc.nextInt());
        }
        arr1.addAll(arr2);
        System.out.println(arr1);
    }
}
