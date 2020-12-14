public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String name){
        super(name);
    }

    public void working(){
        super.doWork();
    }

    //Overriding this method from the parent class
    @Override
    public void doWork() {
        System.out.println("Teaching students...");
    }

    public static void main(String[] args) {
        Teacher Jane = new Teacher("Jane");
        System.out.println(Jane.getName());//Jane
        Jane.doWork(); //Teaching students...
    }
}