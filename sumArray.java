class values{
    int arr[]={10,20,30,40,50,60};
    public void sumArray(){
    // for each loop 
    int result= 0;
    for(int i:arr){
        result+=i;
    }
    // Using Normal for loop
    int val=0;
    for(int n=0;n<arr.length;n++){
        val+=arr[n];
    }
    System.out.println("The sum by using for each loop :"+result);
    System.out.println("The sum by using Normal for loop : "+val);
}
}
public class sumArray {
    public static void main(String args[]){
        values obj=new values();
        obj.sumArray();


    }
}
