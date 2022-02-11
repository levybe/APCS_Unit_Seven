import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void main (String[] args) throws FileNotFoundException {
        ScrabbleHelper helper = new ScrabbleHelper();
        System.out.println(helper.getWordList().get(66349));
    }
}