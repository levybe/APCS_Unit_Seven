import java.util.ArrayList;

public class Merge {
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        ArrayList<Integer> listThree = new ArrayList<>();
        int pos1 = 0;
        int pos2 = 0;
        for (int i = 0; pos1 < listOne.size() && pos2 < listTwo.size(); i++) {
            if (listOne.get(pos1) < listTwo.get(pos2)) {
                listThree.add(listOne.get(pos1));
                pos1++;
            }
            else if (listOne.get(pos1) > listTwo.get(pos2)) {
                listThree.add(listTwo.get(pos2));
                pos2++;
            }
            else {
                listThree.add(listOne.get(pos1));
                pos1++;
                listThree.add(listTwo.get(pos2));
                pos2++;
            }
        }
        return listOne;
    }
}
