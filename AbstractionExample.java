
abstract class Employee {
    String name;

    abstract void work();
}

class Developer extends Employee {
    void work() {
        System.out.println(name + "is the developer who writes the code");
    }
}

class Manager extends Employee {
    void work() {
        System.out.println(name + "is the he manages the team");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Employee dev = new Developer();
        dev.name = "Saurabh";
        dev.work();
        Employee mgr = new Manager();
        mgr.name = "Vedant";
        mgr.work();
    }
}
