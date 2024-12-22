
class Employee {
    String name;
    int id;

    public void work() {
        System.out.println(name + " is working and his ID is " + id);

    }
}

class Developer extends Employee {
    public void code() {
        System.out.println(name + " is the new Developer");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println(name + " is managing the team effectively.");
    }
}

class Tester extends Employee {
    void test() {
        System.out.println(name + " is testing the application thoroughly.");
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.name = "saurabh";
        dev.id = 3991;
        dev.work();
        dev.code();

        Manager mgr = new Manager();
        mgr.name = "Vedant";
        mgr.id = 12345;
        mgr.work();
        mgr.manageTeam();

        Tester tet = new Tester();
        tet.name = "aniket";
        tet.id = 2525298;
        tet.work();
        tet.test();
    }

}
