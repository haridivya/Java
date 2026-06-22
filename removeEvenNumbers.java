import java.util.*;
public class removeEvenNumbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.print("Enter the size of Array is : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the Elements "+(i+1)+": ");
            arr.add(sc.nextInt());
        }
        ArrayList<Integer>arr1=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(arr.get(j)%2!=0){
                arr1.add(arr.get(j));
            }
        }
        System.out.println(arr1);

    }
}
