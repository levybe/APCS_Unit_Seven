import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        ScrabbleHelper helper = new ScrabbleHelper();
        helper.findWords("");
    }
}