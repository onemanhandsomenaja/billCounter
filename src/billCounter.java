// This program counts bill from the amount of Baht currency user enters.
// the highest type is priority.
import java.util.Scanner;

public class billCounter {
    public static void main(String[] args){
        /*
            the steps program takes
                1.receives total amount of money from user
                2.calculates number of 1000-Baht bills.
                3.calculates number of 500-Baht bills.
                4.calculates number of 100-Baht bills.
                5. Displays result to user.

         */
        System.out.println("Welcome to BillCounter.\n Please enter your amount of money:");
        Scanner scan = new Scanner(System.in);
        int totalMoney = scan.nextInt();
        int numberOf1000 = totalMoney / 1000;
        int remains = totalMoney % 1000;
        int numberOf500 = remains / 500;
        remains %= 500;
        int numberOf100 = remains / 100;
        System.out.println("You have got...");
        System.out.printf("%d 1000-Baht bills\n%d 500-Baht bills\n%d 100-Baht bills"
                ,numberOf1000, numberOf500, numberOf100);



    }
}
