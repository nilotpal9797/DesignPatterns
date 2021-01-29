package builder.extended;


public class Employee extends Person {
     private String companyName;
     private int salary;
     private String position;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "firstName='" + getFirstName() +'\'' +
            ",middleName='" + getMiddleName() +'\'' +
            ",lastName='" + getLastName() +'\'' +
            ",currentAddress='" + getCurrenntAddress() +'\'' +
            ",placeOfBirth='" + getPlaceOfBirth() +'\'' +
            ",companyName='" + companyName + '\'' +
            ", salary=" + salary +
            ", position='" + position + '\'' +
            '}';
    }
}
