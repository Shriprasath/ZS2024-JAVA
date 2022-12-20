import java.util.*;
public class Assignment12 {
    public static void main(String[] args){
        Assignment12 output = new Assignment12();
        output. display();
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
        deleteElement();
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
    public void deleteElement(){
        System.out.print("Enter Number to be deleted:");
        int rem=sc.nextInt();
        int [] array2 ;
        array2 = new int[array.length-1];
        int j=0;
        for (int i:array){
            if (i != rem) {
                array2[j]= i;
                j++;
            }
        }
        System.out.print("The elements in Array Are: ");
        System.out.println(Arrays.toString(array2));
        productDivisibleBySum();
    }
    public void productDivisibleBySum(){
        if (pro%sum==0)
            System.out.println("The product is divisible by sum");
        else
            System.out.println("The product is not divisible by sum");
    }
}
