
import java.util.Scanner;

public class Basic{
    public static void main(String[] args){
        System.out.println("Hello world");
        //System.out.printlt("Hello world"); in c language
        Table(8);
        exp();
        area_circle(5);
        perimeter_circle(5);
        print();
    }
    public static void Table(int n){
        for(int i=1;i<=10;i++){
           int result=i*n;
           System.out.println(n+" * "+i+" = "+result);
        }
    }
    public static void exp(){
        double a1=(25.5*3.5-3.5*3.5)/(40.5-4.5);
        System.out.println(a1);
        double a2=4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        System.out.println(a2);
        int a3=-5+8*6;
        System.out.println(a3);
        int a4=(55+9)%9;
        System.out.println(a4);
        int a5=20+-3*5/8;
        System.out.println(a5);
        int a6=5+15/3*2-8%3;
        System.out.println(a6);

    }
    public static void area_circle(int radius){
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle :"+area);
    }
      public static void perimeter_circle(int radius){
        double perimeter=Math.PI*radius*2;
        System.out.println("perimeter of circle :"+perimeter);
    }
    public static void print(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char b=sc.nextLine().charAt(0);
        System.out.println(a);
        System.out.println(b);
        
    }
}