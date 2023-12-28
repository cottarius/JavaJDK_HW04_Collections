import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff();
        createStaff(staff);
        System.out.println(staff.getByExperience(5)+ "\n");

        System.out.println(staff.getPhoneNumberByName("Ivan")+ "\n");

        System.out.println(staff.getById(1) + "\n");

        Employee employee = new Employee(7, "89003456712", "Svetlana", 1);
        staff.addEmployee(employee);
        System.out.println(staff);

    }

    static void createStaff(Staff staff) {
        Employee employee1 = new Employee(1, "89281234567", "Ivan", 2);
        Employee employee2 = new Employee(2, "89283582345", "Oleg", 3);
        Employee employee3 = new Employee(3, "89054872254", "Pavel", 4);
        Employee employee4 = new Employee(4, "89183530987", "Ivan", 5);
        Employee employee5 = new Employee(5, "89515643456", "Olga", 6);
        Employee employee6 = new Employee(6, "89034569100", "Anna", 5);


        staff.addEmployee(employee1);
        staff.addEmployee(employee2);
        staff.addEmployee(employee3);
        staff.addEmployee(employee4);
        staff.addEmployee(employee5);
        staff.addEmployee(employee6);

    }
}
