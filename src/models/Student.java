package models;

public class Student extends Person {
    public double gpa;

    public Student() {}
    public Student(String name,String surname, double gpa) {
        super(name,surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: "+getId_gen()+". "+getName()+" "+getSurname()+" "+getPaymentAmount(gpa);
    }

    public double getPaymentAmount(double gpa) {
        if (gpa>2.67){
            return 36660.00;
        }
        return 0;
    }
}
