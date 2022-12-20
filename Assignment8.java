import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Assignment8 output = new Assignment8();
        output.getInputs();
    }
    Scanner sc = new Scanner(System.in);
    static int values;
    static int[] array;
    public void getInputs(){
        System.out.println("");
        System.out.print("Enter length of array:");
        values = sc.nextInt();
        array = new int[values];
        System.out.println("");
        for (int i=0;i<values;i++){
            System.out.print("Enter  value "+(i+1)+ ": ");
            int  inputs = sc.nextInt();
            array[i] = inputs;
        }
        display();
    }
    public void display(){
        System.out.println("");
        System.out.println("The Array values are:");
        for(int i=0;i<values;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        sumOfArray();
    }
    public int[] sumOfArray(){
        int count1=0;
        int count2=0;
        for(int i=0;i<values;i++){
            if(array[i]%2==0) {
                count1 += array[i];
            }
            else{
                count2 += array[i];
            }
        }
        System.out.println("");
        System.out.println("Sum of the even numbers in this array = "+count1);
        System.out.println("Sum of the odd numbers in this array = "+count2);
        int[] array2 = new int[2];
        array2[0]=count1;
        array2[1]=count2;
        System.out.println("");
        System.out.println("Sum of the odd and even numbers array = ["+array2[0]+","+array2[1]+"]");
        return array2;
    }
}

