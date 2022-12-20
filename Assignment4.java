import java.util.*;
public class Assignment4 {
    public static void main(String[] args) {
        Assignment4 output = new Assignment4();
        output.Enter();
    }
    public static void Enter (){
        System.out.println("Vowel, Consonant, Word Calculator");
        System.out.println("1.Vowel Calculator");
        System.out.println("2. Word Calculator");
        System.out.println("3.Consonant Calculator");
        System.out.println("4.Character Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String:");
        String a = sc.nextLine();
        String b = a.toLowerCase();
        int count = 0;
        int count2 = 0;
        int count3 = 1;
        int count4 = 0;
        for(int i=0 ;i<b.length();i++){
            char x = b.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' )  {
                count++;
                System.out.println("Vowel Count is:"+count);
            }
        }
        for(int i=0 ;i<b.length();i++){
            char x = b.charAt(i);
            if (x == 'b' || x == 'c' || x == 'd' || x == 'f' || x == 'j' ||  x == 'g' || x == 'h' || x == 'k' || x == 'l' || x == 'm' || x == 'n' || x == 'p' || x == 'q' || x == 'r' || x == 's' || x == 't' || x == 'v' || x == 'w' || x == 'x' || x == 'y' ||  x == 'z') {
                count2++;
                System.out.println("Consonant Count is:"+count2);
            }
        }
        for(int i=0 ;i<b.length();i++){
            char x = b.charAt(i);
            if(x == ' '){
                count3++;
                System.out.println("word Count is:"+count3);
            }
        }
        for(int i=0 ;i<b.length();i++) {
            char x = b.charAt(i);
            int y = count + count2 + count4;
            System.out.println("Total Characters Are:" + y);
        }

    }
}
