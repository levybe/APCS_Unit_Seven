import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {

    public static ArrayList getStates () {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> stateNames = new ArrayList<String>();
        System.out.print("Enter the name of a state or \"Stop\" to quit: ");
        String userInput = scan.nextLine();
        System.out.println();
        while (!userInput.equals("Stop")) {
            stateNames.add(userInput);
            System.out.print("Next state or \"Stop\": ");
            userInput = scan.nextLine();
            System.out.println();
        }
        return stateNames;
    }

    public static String createList(ArrayList<String> stateNames) {
        String returnString = "";
        for (String state : stateNames) {
            if (!state.equals(stateNames.get(stateNames.size() - 1))) {
                returnString += state + " -> ";
            }
            else {
                returnString += state;
            }
        }
        return returnString;
    }


    public static ArrayList<Integer> largestAndSmallest(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        int largest = 0;
        int smallest = 0;

        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
            else if (num < smallest) {
                smallest = num;
            }
        }

        return list;
    }







}
