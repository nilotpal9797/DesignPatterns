package builder.extended;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    protected Employee employee;

    public EmployeeBuilder(Employee emp){
        super(emp);
        this.employee = emp;
    }

    public EmployeeBuilder setSalary(int salary){
        this.employee.setSalary(salary);
        return this;
    }
    public EmployeeBuilder setCompanyName(String companyName){
        this.employee.setCompanyName(companyName);
        return this;
    }
    public EmployeeBuilder setPosition(String position){
        this.employee.setPosition(position);
        return this;
    }

    public Employee build(){
        return this.employee;
    }
}
