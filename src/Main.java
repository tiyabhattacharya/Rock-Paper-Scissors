import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your choice");
        System.out.println("0-rock \n 1-paper \n 2-scissors");
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        int userChoice=sc.nextInt();
        int pcChoice= rand.nextInt(0,2);
        System.out.println("pc's choice"+" "+pcChoice);
        //0-rock
        //1-paper
        //2-scissors
        if(userChoice==0){
            if(pcChoice==1){
                System.out.println("PC WON!!");
            } else if (pcChoice==2) {
                System.out.println("USER WON!!");
            }
            else {
                System.out.println("IT's A TIE!");
            }
        } else if (userChoice==1) {
            if (pcChoice==0){
                System.out.println("USER WON!!");
            } else if (pcChoice==2) {
                System.out.println("PC WON!!");

            }else {
                System.out.println("IT'S A TIE!!");
            }

        }else {
            if(pcChoice==0){
                System.out.println("PC WON!!");
            } else if (pcChoice==1) {
                System.out.println("USER WON!!");
            }else {
                System.out.println("IT'S A TIE!!");
            }
        }
    }
}
