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

public class SingleInheritancenew {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "saurabh";
        dev.id = 3991;
        dev.work();
        dev.code();
    }
}
