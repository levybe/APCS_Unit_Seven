import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlgorithms {
    public static ArrayList<Integer> fileDuplicates(String file1, String file2) throws FileNotFoundException {
        ArrayList<Integer> list3 = new ArrayList<>();
        Scanner input1 = new Scanner(new File(file1));
        ArrayList<Integer> list1 = new ArrayList<>();
        while (input1.hasNext()) {
            list1.add(input1.nextInt());
        }
        Scanner input2 = new Scanner(new File(file2));
        ArrayList<Integer> list2 = new ArrayList<>();
        while (input2.hasNext()) {
            list2.add(input2.nextInt());
        }
        for (int num : list1) {
            if (list2.contains(num)) {
                if (!list3.contains(num)) {
                    list3.add(num);
                }
            }
        }
        return list3;
    }
    public static ArrayList<String> removeDuplicates(String filename)throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        System.out.println(list);
    }
/*
    public static ArrayList<Integer> orderedList()throws FileNotFoundException {

    }

 */

}
