import java.util.*;
public class maxElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> values=new ArrayList<>();
        System.out.print("Enter the Size of an Array : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the Element " + (i+1)+" : ");
            values.add(sc.nextInt());
        }
        int maxEle=values.get(0);
        for(int i:values){
            if(i>maxEle){
                maxEle=i;
            }
        }
        System.out.println("Maximum Element in Array is : "+maxEle);

    }
}
