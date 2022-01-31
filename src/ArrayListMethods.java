import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(12);
        arrayList.add(-1);
        arrayList.add(2, 10);
        arrayList.set(1, 9);
        arrayList.remove(4);
        return arrayList;
    }

    public static ArrayList<Double> firstAndLast() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter some decimal numbers. Enter 0 if you have finished entering numbers.");
        double numEntered = scan.nextDouble();
        double firstNum = numEntered;
        double lastNum = numEntered;
        double numsEntered = 0;
        while (numEntered != 0) {
            lastNum = numEntered;
            numsEntered ++;
            numEntered = scan.nextDouble();
        }
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(numsEntered);
        numbers.add(firstNum);
        numbers.add(lastNum);
        return numbers;
    }

    public static boolean double23(ArrayList<Integer> nums) {
        if (nums.size() < 2) {
            return false;
        }
        else {
            if (nums.get(0) == 2 && nums.get(1) == 2 || nums.get(0) == 3 && nums.get(1) == 3) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
            return true;
        }
        else {
            return false;
        }
    }
}
