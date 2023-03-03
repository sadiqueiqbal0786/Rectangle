
import java.util.Scanner;



class Rectangle<R> {
    private R length;
    private R breadth;


    Rectangle(R length, R breadth){
        this.length=length;
        this.breadth=breadth;
    }
   /* int getLength(int length){
        this.length=length;
                return length;
    }
    int getBreadth(int breadth){
        this .breadth=breadth;
        return breadth;
    }*/
   public R getLength() {
       return length;
   }

    public void setLength(R length) {
        this.length = length;
    }

    public R getBreadth() {
        return breadth;
    }

    public void setBreadth(R breadth) {
        this.breadth = breadth;
    }

    int Area(){
       int b= Integer.valueOf(getBreadth().toString());
       int l =Integer.valueOf(getLength().toString());
       int area =b*l;
         return area;
        //int area = length*breadth;
        //System.out.print(area);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        int a= sc.nextInt();
        int b=sc.nextInt();
        Rectangle<Integer> rectangle=new Rectangle<>(a,b);
        System.out.print("Area = "+rectangle.Area());
    }
}