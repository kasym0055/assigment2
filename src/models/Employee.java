package models;

public class Employee extends Person {
    public double salary;

    public Employee() {}

    public Employee( String name, String surname,double salary) {
        super(name, surname);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getId_gen()+". ";
    }
}
