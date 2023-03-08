package demos.oop.zookeeper;

public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);

    }

    public void throwSomething(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy -= 5);
        System.out.println("The gorilla threw something");
    }
    
    public void eatBanana(){
        int currentEnergy = displayEnergyLevel();
        this.setEnergyLevel(currentEnergy += 10);
        System.out.println("The gorilla threw something");

    }

    @Override
    public void growHair() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'growHair'");
    }
    
}
