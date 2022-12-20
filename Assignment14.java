import java.util.*;
public class Assignment14 {
      Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Assignment14 output = new Assignment14();
        output.disp(output.toStr());
    }
    public int[][] toStr(){
        int row,column;
        int[][] array={
                {0}
        };
        int [][] Array2;
        System.out.print("Enter Number of rows : ");
        row = scan.nextInt();
        System.out.print("Enter Number of columns : ");
        column= scan.nextInt();
        Array2 =new int[row][column];
        for(int i=0;i< Array2.length;i++) {
            System.out.println("Enter row number " + (i + 1) + " elements");
            for (int j = 0; j < Array2[i].length; j++) {
                System.out.print("Enter number : ");
                Array2[i][j] = scan.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Horizontal Array");
        System.out.println("");
        System.out.println(Arrays.deepToString(Array2));
        return Array2;
    }
    public void disp(int[][] Array){
        System.out.println("");
        System.out.println("Vertical Array");
        System.out.println("");
        System.out.print("[  ");
        for(int i=0;i<Array.length;i++) {
            System.out.print("[");
            int j;
            for (j = 0; j < Array[i].length; j++) {
                if (j != Array[i].length - 1)
                    System.out.print(Array[i][j] + ",");
                else
                    System.out.print(Array[i][j]);
            }
            System.out.print("]");
            if (i!=Array[i].length - 1)
                System.out.println("");
        }
        System.out.print("  ]");
    }
}
