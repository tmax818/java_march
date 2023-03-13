package demos.oop.zookeeper;



class Test {

    public static void main(String[] args) {
        Gorilla g = new Gorilla(100);
        Gorilla kingKong = new Gorilla(100);
        // Mammal m = new Mammal();
        kingKong.eatBanana();
        g.throwSomething();
        g.eatBanana();
        Bat b = new Bat();
        Penguin p = new Penguin();
        Pelican pl = new Pelican();
        pl.fly();
        System.out.println(b.displayEnergyLevel());
        System.out.println(g.displayEnergyLevel());
    }

}