import java.util.*;
public class Assignment2 {
    public static void main(String[] args) throws Exception {
        System.out.println("FUN GAME");
        System.out.println("Guess The Country From The Natonal Flag");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println(" ");
        System.out.println("Enter the Question Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an option= ");
        byte no = sc.nextByte();
        int i;
        for (i = 1; i < 2; i++) {
            if (no == 1) {
                System.out.println( "\uD83C\uDDE6\uD83C\uDDEA");
                {
                    Thread.sleep(3000);
                    System.out.println("United Arab Emirates");
                }
            } else if (no == 2) {
                System.out.println("\ud83c\udde6\ud83c\uddf7");
                {
                    Thread.sleep(3000);
                    System.out.println("Argentina");
                }
            } else if (no == 3) {
                System.out.println("\ud83c\uddf9\ud83c\uddf7");
                {
                    Thread.sleep(3000);
                    System.out.println("Turkey");
                }
            } else if (no == 4) {
                System.out.println("\ud83c\uddff\ud83c\udde6");
                {
                    Thread.sleep(3000);
                    System.out.println("South Africa");
                }
            } else if (no == 5) {
                System.out.println("\ud83c\uddfd\ud83c\uddea");
                {
                    Thread.sleep(3000);
                    System.out.println("England");
                }
            } else if (no == 6) {
                System.out.println("\ud83c\uddf7\ud83c\uddfa");
                {
                    Thread.sleep(3000);
                    System.out.println("Russia");
                }
            } else if (no == 7) {
                System.out.println("\ud83c\udde8\ud83c\udde6");
                {
                    Thread.sleep(3000);
                    System.out.println("canada");
                }
            } else if (no == 8) {
                System.out.println("\ud83c\udde9\ud83c\uddea");
                {
                    Thread.sleep(3000);
                    System.out.println("Germany");
                }
            } else {
                System.out.println("Question Number Out Of Limit");
            }
        }
    }
}
