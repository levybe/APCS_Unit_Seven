public class Donor {
    private String name = "";
    private double amount = 0.0;

    public Donor () {
        name = "";
        amount = 0.0;
    }

    public Donor (String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName () {
        return name;
    }

    public double getAmount () {
        return amount;
    }



}
