import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {
    private ArrayList<String> wordList = new ArrayList<>();

    public ScrabbleHelper() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("files/enable.txt"));
        while (scan.hasNext()) {
            wordList.add(scan.nextLine());
        }
    }

    public ArrayList<String> getWordList() {
        return wordList;
    }

    public boolean foundWord(String word) {
        int min = 0;
        int max = wordList.size() - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (wordList.get(mid).equals(word)) {
                return true;
            } else if (wordList.get(mid).compareTo(word) > 0) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public ArrayList<String> findMatches(String pattern) {
        ArrayList<String> matchingWords = new ArrayList<>();
        for (String word : wordList) {
            if (word.indexOf(pattern) != -1) {
                matchingWords.add(word);
            }
        }
        return matchingWords;
    }

    public void sortWords(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String temp = words.get(i);
            int possible = i;
            while (possible > 0 && temp < ) {
                possible = possible
            }
        }
    }
}

