/**
 *
 * Java Basic. Home Work #4
 * @autor Sergej Kel
 * @todo 14.9.2022
 * @date 18.9.2022
 */
import java.util.Random;
import java. util.Scanner;

class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int guess = -1;
        do {
            number = random.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.print("Guess the number [O..9)]; ");
                guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println ("Your number is less");
                } else if (guess > number) {
                    System.out.println("Your number is bigger");
                } else {
                    System.out.println("Your WINM, yor guess my number");
                    break;
                }
            }
            if (number != guess) {
                System.out.println("Yor lose.");
            }
            System.out.print("Repeat game? YES -1, NO - 0: ");
        } while (scanner.nextInt() == 1);
    }
}