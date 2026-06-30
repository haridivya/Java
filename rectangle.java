import java.util.*;
public class rectangle {
    static Scanner sc=new Scanner(System.in);
    int length;
    int width;
    int res;
    int per;
    int calculateArea(){
        res=length*width;
        return res;
    }
    int calculatePerimeter(){
        per=2*(length+width);
        return per;
    }
    rectangle(){
        System.out.println("Enter The Length of Rectangle : ");
        length=sc.nextInt();
        System.out.println("Enter The Width of Rectangle : ");
        width=sc.nextInt();
    }
    public static void main(String args[]){
        rectangle rec=new rectangle();
        System.out.println("Area = "+rec.calculateArea());
        System.out.println("perimeter = "+rec.calculatePerimeter());

    }
}
