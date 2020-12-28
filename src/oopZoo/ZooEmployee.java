package oopZoo;

public class ZooEmployee extends Human {
    //protected instance property. Represents whether a zoo employee is a zookeeper or not
    protected boolean zookeeper;

    //Constructor matching super
    public ZooEmployee(String firstName, String lastName, boolean zookeeper) {
        super(firstName, lastName);
        this.zookeeper = zookeeper;
    }

    //Instance Method that returns a boolean indicating whether or not an employee is a zookeeper
    public boolean isZookeeper() {
        return this.zookeeper;
    }
}
