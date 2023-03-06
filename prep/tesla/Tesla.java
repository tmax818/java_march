package prep.tesla;



public class Tesla {

    //fields
    private String color;
    String model;
    int charge;


    public Tesla() {
        this("black", "model y", 100);
    }

    public Tesla(String color, String model, int charge) {
        this.color = color;
        this.model = model;
        this.charge = charge;
    }


    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", model='" + getModel() + "'" +
            ", charge='" + getCharge() + "'" +
            "}";
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }







    
}
