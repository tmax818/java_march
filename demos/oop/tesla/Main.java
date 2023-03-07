package demos.oop.tesla;

public class Main {
    
    public static void main(String[] args) {
        Tesla tylers_tesla = new Tesla();
        System.out.println(tylers_tesla.getColor());
        Tesla erins_tesla = new Tesla();
        Tesla emmanuels_tesla = new Tesla("blue", 34, 2023, 100);
        System.out.println(erins_tesla);
        tylers_tesla.setColor("pink");
        System.out.println(tylers_tesla.getCharge());
        System.out.println(erins_tesla.getColor());
        System.out.println(Tesla.CEO);
        System.out.println(Tesla.totalTeslas);
        System.out.println(tylers_tesla.CEO);
        System.out.println(tylers_tesla.driveTesla());
        System.out.println(Tesla.displayCEO());

    }
}
