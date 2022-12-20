import java.util.*;
public class Assignment11 {
    public static void main(String[] args) {
        Assignment11 output = new Assignment11();
        output.display();
    }
    int[] array;
    int sum=0;
    int pro=1;
    Scanner sc=new Scanner(System.in);
    public void display(){
        getInput();
        disp();
        min();
        max();
        sumOfArray();
        proOfArray();
    }
    public void getInput() {
        System.out.print("Enter the number of elements in array: ");
        int n=sc.nextInt();
        array = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the elements of the array: ");
            array[i]=sc.nextInt();
        }
    }
    public void disp(){
        System.out.print("The elements in Array Are: ");
        System.out.println(Arrays.toString(array));
    }
    public void min(){
        int min=array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("The Minimum Value in Array ="+min);
    }
    public void max(){
        int max=array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("The Maximum Value in Array ="+max);
    }
    public void sumOfArray(){
        for(int i:array){
            sum+=i;
        }
        System.out.println("Sum of elements in Array ="+sum);
    }
    public void proOfArray(){
        for(int i:array){
            pro*=i;
        }
        System.out.println("Product of elements in Array ="+pro);

    }
}
