package builder.extended;

import builder.extended.Employee;
import builder.extended.EmployeeBuilder;

public class EmployeeBuilderDemo {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new EmployeeBuilder(emp)
            .setCompanyName("Amazon")

            .setSalary(3300000)
            .setFirstName("Rahul")
            .setLastName("Gardener")
            .build();
        System.out.println(emp1);
    }
}
