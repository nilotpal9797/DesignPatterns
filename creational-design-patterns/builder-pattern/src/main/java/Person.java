public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String placeOfBirth;
    private String currenntAddress;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setCurrenntAddress(String currenntAddress) {
        this.currenntAddress = currenntAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", placeOfBirth='" + placeOfBirth + '\'' +
            ", currenntAddress='" + currenntAddress + '\'' +
            '}';
    }
}
