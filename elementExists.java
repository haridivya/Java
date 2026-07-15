import java.util.*;
public class elementExists 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList<>();
        System.out.print("Enter the Size of Array : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.print("Enter the Element to find out : ");
        int ele=sc.nextInt();
        if(arr.contains(ele))
        {
            System.out.println("The element is found in array");
        }
        else
        {
            System.out.println("The Element is not found in array");
        }    

    }
}
