public class Developer extends Employee {

    public Developer(){
    }

    public Developer(String name){
        super(name);
    }

    public void doWork(){
        System.out.println("Writing code");
    }

    //Calling on implementation of doWork from super class as opposed to this class
    public void working(){
        super.doWork();
    }

    public void debug(){
        System.out.println("DEBUGGING");
    }

    public static void main(String[] args) {
        Employee Bob = new Employee("Bob");
        Bob.doWork(); //Working... working...

        Developer John = new Developer("John");
        John.doWork(); //Writing code

        John.working(); //Working... working...
    }
}
