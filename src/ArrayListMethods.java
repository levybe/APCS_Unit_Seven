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
        double firstNum = scan.nextDouble();
        double num = firstNum;
        double numsEntered = 0;
        while (num != 0) {
            num = scan.nextDouble();
            numsEntered += 1;
        }
    }

    /*

    public static boolean double23(ArrayList<Integer> nums) {


    }




    public static boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {


    }
*/

}
