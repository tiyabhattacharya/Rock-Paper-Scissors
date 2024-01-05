import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times you want to try");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("enter your choice");
            System.out.println("0-rock  1-paper  2-scissors");

            Random rand = new Random();
            int userChoice = sc.nextInt();
            int pcChoice = rand.nextInt(0, 2);
            System.out.println("pc's choice" + " " + pcChoice);
            //0-rock
            //1-paper
            //2-scissors
            if (userChoice == 0) {
                if (pcChoice == 1) {
                    System.out.println("PC WON!!");
                } else if (pcChoice == 2) {
                    System.out.println("USER WON!!");
                } else {
                    System.out.println("IT's A TIE!");
                }
            } else if (userChoice == 1) {
                if (pcChoice == 0) {
                    System.out.println("USER WON!!");
                } else if (pcChoice == 2) {
                    System.out.println("PC WON!!");

                } else {
                    System.out.println("IT'S A TIE!!");
                }

            } else {
                if (pcChoice == 0) {
                    System.out.println("PC WON!!");
                } else if (pcChoice == 1) {
                    System.out.println("USER WON!!");
                } else {
                    System.out.println("IT'S A TIE!!");
                }
            }
        }
    }
}
