package abstractClassesInterfaces;

//Declaring this as an "interface"
public interface McFranchise {
    //Properties
    String companyName = "McDonald's"; //this String is a constant

    //We won't have a constructor in an "interface" (ONLY IN ABSTRACT CLASSES)

    //Abstract Methods(that we have to completely write out in any class that IMPLEMENTS this interface
    public void broilStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();
}
