# Java Program to find out the reapeating Elements in the Array and print reapeating elements and it is odd 
import java.util.*;
class Main {
    public static void oddRepeatingElementInArrays(int[] arr,int[] arr2){
        int i=0;
        int j=0;
        boolean temp=true;
        while(i<arr.length && j<arr2.length){
            if(arr[i]==arr2[j] && arr[i]%2!=0){
                temp=false;
                System.out.println(arr[i]);
                i++;
                j++;
            }
            else if(arr[i]>arr[j]){
                j++;
            }
            else{
                i++;
            }
        }
        if(temp){
            System.out.print(-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        oddRepeatingElementInArrays(arr,arr2);  
    }
}
