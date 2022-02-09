import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> donorList;

    public static void main(String[] args) throws IOException {
        donorList = new ArrayList<>();
        getDonorList("files/donors.txt");
        sortDonorList();
        System.out.println(donorList.get(0).getName()); // Should print out Hernandez
        System.out.println(donorList.get(donorList.size()-1).getName()); // Should print out Hall
        System.out.println(getDonatedAmount("Anderson")); // should print 1436.5
        System.out.println(getDonatedAmount("Roberts")); // should print 307.86
        System.out.println(getDonatedAmount("Wilkinson")); // should print 0.0

    }

    public static void getDonorList(String filename) throws IOException {
        String name = "";
        double amount = 0.0;
        Scanner scan = new Scanner(new File (filename));
        while (scan.hasNext()) {
            name = scan.next();
            amount = scan.nextDouble();
            Donor donor = new Donor(name, amount);
            donorList.add(donor);
        }
    }

    public static void sortDonorList() {
        for (int i = 1; i < donorList.size(); i++) {
            Donor temp = donorList.get(i);
            int possibleIndex = i;
            while (possibleIndex > 0 && temp.getAmount() < donorList.get((possibleIndex - 1)).getAmount()) {

            }
        }
    }

    public static double getDonatedAmount(String name) {


        return 0.0; // this is returned if the name is not found
    }
}
