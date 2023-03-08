package demos.oop.zookeeper;

public class Bat extends Mammal implements Flyable {
    


    public Bat() {
    // this.setEnergyLevel(300); 
    super(300);
    }

    @Override
    public void fly() {
        System.out.println("Im a bat and I can fly and I am kind of a jerk!!");

    }

    @Override
    public void growHair() {

    }



   

}
