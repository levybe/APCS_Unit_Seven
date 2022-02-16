import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        ScrabbleHelper helper = new ScrabbleHelper();
//        System.out.println(helper.getWordList().get(66349));
        String wordEntered = "Hello, world!";
        ArrayList<String> sorted = helper.findMatches("ware");
        helper.sortWords(sorted);
        System.out.println(sorted);

//        while (wordEntered != "") {
//            System.out.print("Enter a word to test: ");
//            wordEntered = scan.nextLine();
//            if (helper.foundWord(wordEntered)) {
//                System.out.println("\"" + wordEntered + "\" is a word");
//            }
//            else {
//                System.out.println("\"" + wordEntered + "\" is not a word");
//            }
//        }
        System.out.println("Goob-bye!"); // The instructions said to print the words "Goob-bye".
    }
}