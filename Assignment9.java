import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Assignment9 output = new Assignment9();
        output.roundOff();
    }
    public  void  roundOff(){
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter number to roundoff:");
        int num = sc.nextInt();
        String abc = Integer.toString(num);
        int x = abc.length();
        System.out.println("");
        for (int i=1;i<x;i++){
            if (num % (Math.pow(10,(i))) > (5*(Math.pow(10,(i-1))))){
                double a = Math.pow(10,(i));
                double b= num % a;
                int d = (int) b;
                int e = (int) a;

                System.out.println("Round off upto "+e+" is: "+((num)+(e-d)));
            }
            else{
                double a = Math.pow(10,(i));
                double b= num % a;
                int d = (int) b;
                int e = (int) a;
                System.out.println("Round off upto "+e+" is: "+((num)-(d)));
            }
        }


    }
}
