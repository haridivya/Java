# Print the reapeated Elements in the Array where the order of array is not same
Array1 is in Ascending Order. Array2 is in Descending Order.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
          arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
      for(int i=0;i<m;i++){
          arr2[i]=sc.nextInt();
        }
        int i=0;
        int j=arr2.length-1;
        boolean t=true;
        while(i<arr1.length && j>=0)
        {
            if(arr1[i]==arr2[j]){
                t=false;
                System.out.println(arr1[i]);
                i++;
                j--;
            }
            else if(arr1[i]>arr2[j]){
                j--;
            }
            else{
                i++;
            }   
        }
        if(t){
            System.out.print("No Repeated Elements found");
        }
    }
}
