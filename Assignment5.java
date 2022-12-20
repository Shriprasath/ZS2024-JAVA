import java.util.*;
public class Assignment5 {
    public static void main(String[] args) {
        Assignment5 output = new Assignment5();
        output.start();
    }
        public static void start() {
            System.out.println("Welcome to Emoji pattern generator");
            System.out.println("1.Upper Triangular Pattern");
            System.out.println("2.Lower Trianguar Pattern");
            System.out.println("3.Diamond pattern");
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter Your choice:");
            int ch = sc.nextInt();
            if (ch == 1){
                upperTriangle();
            }
            else if (ch == 2){
                lowerTriangle();
            }
            else if (ch == 3){
                diamond();
            }
        }
        public static void upperTriangle() {
            Scanner a = new Scanner(System.in);
            System.out.print("Enter number of lines:");
            int x=a.nextInt();
            for(int i=1;i<=x;i++){
                String p = "\ud83d\ude00"+"  ";
                String abc = p.repeat(i);
                System.out.println(abc);
            }
        }
        public static void lowerTriangle() {
            Scanner b = new Scanner(System.in);
            System.out.print("Enter number of lines:");
            int y=b.nextInt();
            for(int i=y;i>=1;i--){
                String p ="  "+"\ud83d\ude00";
                String q ="    ";
                String abc = p.repeat(i);
                String pqr = q.repeat(y-i);
                System.out.println(pqr+abc);
            }
        }
        public static void diamond() {
            Scanner c = new Scanner(System.in);
            System.out.print("Enter number of elements in largest line:");
            int z=c.nextInt();
            for(int i=1;i<z;i++){
                String p = " "+"\ud83d\ude00"+"   ";
                String q ="   ";
                String pqr = q.repeat(z-i);
                String abc = p.repeat(i);
                System.out.println(pqr+abc);
            }
            for(int i=z;i>=1;i--){
                String p = " "+"\ud83d\ude00"+"   ";
                String q ="   ";
                String pqr = q.repeat(z-i);
                String abc = p.repeat(i);
                System.out.println(pqr+abc);
            }
        }
    }

