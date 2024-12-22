class Employee {
    String name;
    int id;
    double salary;

    public void DisplayDetails() {
        System.out.println("The name is :" + name);
        System.out.println("The ID is :" + id);
        System.out.println("The salary is :" + salary);
    }
}

class Developer extends Employee {
    public void DisplayRole() {
        System.out.println("The Role is : Developer");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "saurabh";
        dev.id = 3991;
        dev.salary = 100000.0;
        dev.DisplayDetails();
        dev.DisplayRole();
    }
}
