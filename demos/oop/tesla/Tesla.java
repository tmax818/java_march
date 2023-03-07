package demos.oop.tesla;

public class Tesla {

    // instance and class attributes
    private String color;
    private int miles;
    protected int year;
    int charge;
    static String CEO = "Elon Musk";
    static int totalTeslas = 0;

    // constructors called when a new instance is made

    // no arg constructor
    public Tesla() {
        Tesla.totalTeslas++;
    }

    // overloaded construtor
    public Tesla(String color) {
        this();
        this.color = color;
    }

    public Tesla(String color, int miles, int year, int charge) {
        this();
        this.color = color;
        this.miles = miles;
        this.year = year;
        this.charge = charge;

    }

    public Tesla(int year, int charge) {
        this();
        this.year = year;
        this.charge = charge;

    }

    // instance and class methods

    public int driveTesla(){
        this.charge--;
        System.out.println("silence...");
        return this.charge;
    }

    public static String displayCEO(){
        return Tesla.CEO;
    }



    // getters and setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if(color != "pink"){
            this.color = color;
        }
    }

    public int getMiles() {
        return this.miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

}
