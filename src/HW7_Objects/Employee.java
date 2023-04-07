package HW7_Objects;

public class Employee  {

//        Необходимо создать класс HW7_Objects.Employee с полями как у HW7_Objects.Person (из предыдущего задания)
//        и поле зарплата. Класс должен иметь метод isSameName(HW7_Objects.Employee employee) который
//        возвращает true, если у сотрудника у которого был вызван метод и сотрудника который
//        был передан как параметр, одинаковое имя.
    String name;
    int age;
    String gender;
    double salary;

    boolean isSameName(Employee employee) {

        return employee.equals(employee.name);
    }

}

