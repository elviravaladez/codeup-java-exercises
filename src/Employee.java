public class Employee {
    public String name;
    public int id;

    //Empty Constructor
    public Employee() {

    }

    //Constructor
    public Employee(String name) {
        this.name =name;
    }

    public void doWork() {
        System.out.println("Working... working...");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
