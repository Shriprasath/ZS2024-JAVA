import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        Assignment7 output = new Assignment7();
        output.getInputs();
    }
        Scanner sc = new Scanner(System.in);
        static int values;
        static int[] array;
        int getIn;
        public void getInputs(){
            System.out.println(" ");
            System.out.print("Enter length of array : ");
            values = sc.nextInt();
            array = new int[values];
            System.out.println(" ");
            for (int i=0;i<values;i++){
                System.out.print("Enter  value "+(i+1)+ " : ");
                int  inputs = sc.nextInt();
                array[i] = inputs;
            }
            System.out.println("");
            display();
        }
        public void display(){
            System.out.print("The Array values are: [");
            for(int i=0;i<values;i++){
                System.out.print(array[i]+" ");
            }
            System.out.print("]");
            System.out.println(" ");
            System.out.println("");
            System.out.print("Enter element to be searched : ");
            getIn=sc.nextInt();
            System.out.println("");
            isExist();
        }
        public boolean isExist(){
            int c=0;
            for(int i=0;i<array.length;i++){
                if(getIn==array[i]){
                    System.out.println("Yes,"+getIn+" Exists in this Array");
                    c+=1;
                }
            }
            if(c==0){
                System.out.println("No,"+getIn+" does not Exist in this Array");
            }
            return true;
        }
        public int indexOf(){
            int index=0;
            System.out.println(" ");
            for(int i=0;i<array.length;i++){
                if(getIn==array[i]){
                    System.out.println("Index number: "+i+" ");
                    index=i;
                }
            }
            return index;
        }

}
