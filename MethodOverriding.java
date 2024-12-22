class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("The coder writes the code");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        Developer dev = new Developer();
        dev.work();
    }
}
