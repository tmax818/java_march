package tyler.hopper.models;

public class Item {
    private String itemName;
    private double price;
    private String description;
    private String vendor;


    public Item() {
    }


    public Item(String itemName, double price, String description, String vendor) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.vendor = vendor;
    }


    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }



    
}
