import java.util.*;
public class Assignment1 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Favourite Harry Potter House:");
            String month = sc.nextLine();
            if(month.equalsIgnoreCase("Gryffindor")){
                System.out.println("Ambitious and Hardworking \ud83d\ude00");
            }
            else if(month.equalsIgnoreCase("Slytherin")){
                System.out.println("Intelligent and clever  \ud83d\ude00");
            }
            else if(month.equalsIgnoreCase("Hufflepuff")){
                System.out.println("Friendly and funny \ud83d\ude00");
            }
            else if(month.equalsIgnoreCase("Ravenclaw")){
                System.out.println("Caring and kind  \ud83d\ude00");
            }
            else{
                System.out.println("Enter a valid month \ud83d\ude00");
            }
        }
}
