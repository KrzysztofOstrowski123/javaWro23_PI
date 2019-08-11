package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class MainGuessingGame {

    private static final int upperBound = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(upperBound);

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 7; ++i) {
            int playerNumber = scanner.nextInt();
            if(playerNumber == randomNumber) {
                System.out.println("Win!");
                break;
            }
            if(playerNumber < randomNumber)
                System.out.println("Za malo");
            else System.out.println("Za duzo");

        }
    }
}
