import java.util.*;
public class frequencyCount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the Elements : ");
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> values=new ArrayList<>();
        for(int j=0;j<n;j++)
        {
            if(!(values.contains(arr.get(j)))){
                System.out.println(arr.get(j)+" -> "+Collections.frequency(arr,arr.get(j))+" times ");
            }
        }
    }
}
