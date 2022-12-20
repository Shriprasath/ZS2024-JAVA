import java.util.*;
public class Assignment3 {
    public static void main(String[] args) {
        Assignment3 output = new Assignment3();
        output.enter();
    }
    double celcius;
    double height;
    double weight;

    double no;
    public  void enter(){
        System.out.println("Welcome to calculator");
        System.out.println("1.BMI Calculator");
        System.out.println("2.square Calculator");
        System.out.println("3.celsius to kelvin calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        Byte choice=sc.nextByte();
        System.out.println(" ");
        if (choice == 1){
            bmiCalc();

        }
        else if (choice == 2){
            Square();
        }
        else if (choice == 3){
            celKel();
        }
        else {
            System.out.println("Enter a valid option!");
        }
    }
    Scanner c = new Scanner(System.in);
    public void celKel() {
        Scanner c = new Scanner(System.in);
        System.out.println("Celcius To Kelvin conversion:");
        System.out.println("Enter the value for Celcius to convert it into Kelvin:");
        celcius = c.nextDouble();
        double Kelvin = celcius+273.15;
        System.out.println(celcius+" Celcius in Kelvin --> "+Kelvin);
    }
    public void bmiCalc() {
        Scanner h = new Scanner(System.in);
        System.out.println("BMI calculation:");
        System.out.println("Enter your height(meters):");
        height = h.nextDouble();
        Scanner w = new Scanner(System.in);
        System.out.println("Enter your weight(kgs):");
        weight = w.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("Your BMI is --> "+bmi);
    }
    public void Square() {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter A Number To Square:");
        no = n.nextDouble();
        double squ = no * no ;
        System.out.println("The Square is:"+squ);
    }
}
