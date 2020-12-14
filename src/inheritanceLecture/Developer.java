package inheritanceLecture;

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

        Employee sarah = new Employee("Sarah");
        Employee ryan = new Developer("Ryan");

        //***NOTE: Methods available to an object depend on the type that it was assigned to
        //The implementation of the method, depends on the object
        ryan.doWork(); //Writing code

//        ryan.working(); //Can't use this b/c it's not available to the inheritanceLecture.Employee Object, which is what ryan has been set to

    }
}
