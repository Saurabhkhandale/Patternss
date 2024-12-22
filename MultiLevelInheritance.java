
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

class srDeveloper extends Developer {
    public void Review() {
        System.out.println(name + " is a senior developer now and he Reviews the code ");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        srDeveloper srdev = new srDeveloper();
        srdev.name = "saurabh";
        srdev.id = 3991;
        srdev.work();
        srdev.code();
        srdev.Review();
    }
}
