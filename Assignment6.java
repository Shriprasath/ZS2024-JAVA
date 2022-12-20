import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
       Assignment6 output = new Assignment6();
       output.display();
    }
    int[] array;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    public void display(){
        getInput();
        disp();
        smallestNumber();
        sumOfArray();
        checkDivisiblity();
    }
    public void getInput() {
        System.out.println(" ");
        System.out.print("Enter the number of elements in array: ");
        int n=sc.nextInt();
        array = new int[n];
        System.out.println(" ");
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the elements of the array: ");
            array[i]=sc.nextInt();
        }
    }
    public void disp(){
        System.out.println(" ");
        System.out.print("The elements in Array Are: ");
        System.out.println(Arrays.toString(array));
    }
    public void smallestNumber(){
        int min=array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println(" ");
        System.out.print("The Minimum Value in Array =");
        System.out.println(min);
    }
    public void sumOfArray(){
        for(int i:array){
            sum+=i;
        }
        System.out.println(" ");
        System.out.println("Sum of elements in Array ="+sum);
        System.out.println();
    }
    public void checkDivisiblity(){
        if(sum%10==0){
            System.out.println("Sum of elements in Array is divisible by 10");
        }
        else{
            System.out.println("Sum of elements in Array is not divisible by 10");
        }
    }
}
