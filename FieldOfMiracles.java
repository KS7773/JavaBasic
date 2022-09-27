/**
 *
 * Java Basic. Home Work #5
 * @autor Sergej Kel
 * @todo 19.9.2022
 * @date 27.9.2022
 */
import java.util.Random;
import java.util.Scanner;

class FieldofMiracles {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"door", "week", "beer", "food", "tree"};
        String word = words[random.nextInt(words.length)];
        char[] mask = {'#', '#', '#', '#'};
        int counter = 0;
        int letterCounter = 0;

        do {
            counter++;
            System.out.print("Guess the word: [" + new String (mask) + "]: ");
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i) && mask[i] == '#') {
                    mask[i] = letter;
                    letterCounter++;
                }
            }
        } while (letterCounter < word.length());

        System.out.println("You guess the word [" + word +"], attempts: " + counter);
    }
}