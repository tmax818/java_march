package prep.tesla;

public class TestTesla {

    public static void main(String[] args) {
        Tesla tylers_tesla = new Tesla("red", "model X", 100);
        Tesla joshs_tesla = new Tesla();
        Tesla erins_tesla = tylers_tesla;
        erins_tesla.setColor("pink");
        System.out.println("tyler's tesla: " + tylers_tesla);
        System.out.println(joshs_tesla);
    }
    
}
