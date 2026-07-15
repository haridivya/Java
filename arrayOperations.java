import java.util.Arrays;
public class arrayOperations{
    public static void main(String args[]){
        //Creation of array 
        int arr[]={10,20,30,40,50};
        // Traversal of array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // To print in Array Format
        System.out.println(Arrays.toString(arr));
    }
}