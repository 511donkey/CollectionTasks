import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee() {
    }

    public Employee(String name, String company, int salary, int age) {
        setName(name);
        setCompany(company);
        setSalary(salary);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null) this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary != 0) this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 21 && age <= 60) this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[(int) (Math.random() * 11)],
                    companies[(int) (Math.random() * 7)],
                    (int) (Math.random() * 4001 + 2000),
                    (int) (Math.random() * 40 + 21)));
        }
        return employees;
    }

    public static void main(String[] args) {

        //// Создать список объетов List<Employee> (использовать метод employeeGenerator)
//// и сортировать по:
//// имени
//// имени и зарплете
//// имени, зарплете, возрасту и компании

        System.out.println("сгенерировали список " + employeeGenerator(10));

        List<Employee> employees1 = employeeGenerator(10);

        Comparator<Employee> nameComparator = new NameComparator();
        employees1.sort(nameComparator);
        System.out.println(employees1);

        Comparator<Employee> nameSalaryComparator = new NameComparator().thenComparing(new SalaryComparator());
        employees1.sort(nameSalaryComparator);
        System.out.println(employees1);

        Comparator<Employee> nameSalaryAgeCompanyComparator = new NameComparator().thenComparing(new SalaryComparator())
                .thenComparing(new AgeComparator()).thenComparing(new CompanyComparator());
        employees1.sort(nameSalaryAgeCompanyComparator);
        System.out.println(employees1);
    }

}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getSalary(), employee2.getSalary());
    }
}

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getAge(), employee2.getAge());
    }
}

class CompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getCompany().compareTo(employee2.getCompany());
    }
}

