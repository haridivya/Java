import java.util.*;
public class SelectionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of an Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the Element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Selection Sort : "+ Arrays.toString(arr));
        for(int i=0;i<n;i++){
            int min_ele_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ele_index]){
                    min_ele_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_ele_index];
            arr[min_ele_index]=temp;
        }
        System.out.println("After the Selection Sort : "+Arrays.toString(arr));

    }
}
