package abstractClassesInterfaces;

//I am declaring this to be an ABSTRACT class
public abstract class Franchise {
    //All the methods in an abstract class are like a list of
    // rules or requirements for what needs to be implemented
    // in any class that **EXTENDS** this abstract class

    //If we were to create a class that extends a Franchise
    // i.e. McDonald's on I-10 vs McDonald's on Loop 1604

    //Properties (constant values)
    private final String companyName = "McDonalds"; //this is always the
    //same, no matter where we build a franchise location
    private String managerName;


    //If we have enough properties to warrant a constructor - to set those
    //values when initializing this class  - let's create that here
    public Franchise(String managerName) {
        //we don't have to set companyName b/c it is already final
        this.managerName = managerName;
    }


    //Methods
    public abstract void broilStuff(String menuItem); //broilStuff("bicMac")

    //for example, 8am = 800, 10px = 2200
    public abstract void businessHours(int openTime, int closeTime);

    //non-void method
    public abstract boolean iceCreamMachineWorking();

    //non-abstract method
    public void greetCustomer() {
        //we have to write out the method body, b/c we did NOT use the
        //abstract keyword when declaring the method
        System.out.println("Welcome to " + this.companyName + ". Enjoy your meal.");
    }


//    //Static
//    double result = Math.pow(10, 2);
//
//    //Non-static
//    Math myCoolMathTool = new Math(); //can't instantiate Math b/c it has private access

    //Getter and Setter
    public String getCompanyName() {
        return companyName; //can retrieve this from any class that
        // extends this abstract class, even though it's declared private
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
