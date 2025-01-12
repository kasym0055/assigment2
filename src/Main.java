import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> persons=new ArrayList<>();
        while (sc.hasNext()) {
            String[] parts = sc.nextLine().split(" ");
            if (parts[0].equals("Employee")){
                Employee employee=new Employee(parts[1],parts[2],Double.parseDouble(parts[3]));
                persons.add(employee);
            }
            else if (parts[0].equals("Student")){
                Student student=new Student(parts[1],parts[2],Double.parseDouble(parts[3]));
                persons.add(student);
            }

        }
    }
}