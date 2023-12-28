import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Staff {
    private List<Employee> employees;

    public Staff() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getById(int id) {
        return employees.stream().filter(x -> x.id() == id).toList().get(0);
    }

    public List<Employee> getByExperience(int experience) {
        return employees.stream().filter(x -> x.experience() == experience).toList();
    }

    public List<String> getPhoneNumberByName(String name) {
        return employees.stream()
                .filter(employee -> employee.name().equals(name))
                .map(Employee::phoneNumber)
                .toList();
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
            stringBuilder.append(employee).append("\n");
        }
        return stringBuilder.toString();
    }
}
