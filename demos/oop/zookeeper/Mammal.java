package demos.oop.zookeeper;

public class Mammal {
    private int energyLevel = 100;


    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }



    public int displayEnergyLevel() {
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    
    
}
