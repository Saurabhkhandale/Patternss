class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name + ", age: " + age);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setname("Saurabh");
        emp.setAge(24);
        emp.displayDetails();
    }
}
