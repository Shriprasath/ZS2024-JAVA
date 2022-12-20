import java.util.*;
public class Assignment13 {
    public static void main(String[] args) {
    Assignment13 output = new Assignment13();
    output.getInput();
}
    double sum=0;
    int[] array;
    Scanner sc=new Scanner(System.in);
    public void getInput() {
        System.out.println("Finding Missing Element");
        System.out.print("Enter the number of elements in array: ");
        int n=sc.nextInt();
        array = new int[n-1];
        for(int i=0; i<(n-1); i++)
        {
            System.out.print("Enter the elements of the array: ");
            array[i]=sc.nextInt();
        }
        disp();
    }
    public void disp(){
        System.out.print("The elements in Array Are: ");
        System.out.println(Arrays.toString(array));
        sumOfArray();
    }
    public void sumOfArray(){
        int n1=0;
        for(int i:array){
            sum+=i;
            n1++;
        }
        double s = ((n1+1)*(n1+2))/2;
        System.out.println("Missing element in Array ="+(s-sum));
        duplicateEle();
    }
    public void duplicateEle() {
        System.out.println("Removing duplicates");
        Set<Integer> unique = new HashSet<Integer>();
        System.out.print("Enter the number of elements in array:");
        int len=sc.nextInt();
        int array2[]=new int[len];
        int sum = 0;
        for(int i=0;i<len;i++)
        {

            System.out.print("Enter the elements of the array: ");
            array2[i]=sc.nextInt();
            sum=sum+array2[i];
            unique.add(array2[i]);

        }
        System.out.println(unique);


    }

}
