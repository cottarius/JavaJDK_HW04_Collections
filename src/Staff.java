import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Staff {
    private List<Employee> employees;

    public Staff() {
        employees = new ArrayList<>();
    }

    /**
     * Добавление нового сотрудника
     * @param employee новый сотрудник
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Поиск сотрудника по ID
     * @param id id сотрудника
     * @return сотрудник по id
     */
    public Employee getById(int id) {
        return employees.stream().filter(x -> x.id() == id).toList().get(0);
    }

    /**
     * Поиск сотрудников по стажу работы
     * @param experience стаж работы
     * @return список сотрудников по стажу работы
     */
    public List<Employee> getByExperience(int experience) {
        return employees.stream().filter(x -> x.experience() == experience).toList();
    }

    /**
     * Поиск номера телефона/телефонов по имени сотрудника
     * @param name имя сотрудника
     * @return список телефонов
     */
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
