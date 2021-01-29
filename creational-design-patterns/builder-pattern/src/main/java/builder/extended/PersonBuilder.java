package builder.extended;


public class PersonBuilder<T extends PersonBuilder<T>> {
    protected Person person;

    public PersonBuilder(Person person){
        this.person = person;
    }
    public PersonBuilder(){

    }

    public T setFirstName(String firstName){
        person.setFirstName(firstName);
        return (T)this;
    }
    public T setMiddletName(String middletName){
        person.setMiddleName(middletName);
        return (T)this;
    }
    public T setLastName(String lastName){
        person.setLastName(lastName);
        return (T)this;
    }
    public T setPlaceOfBirth(String placeOfBirth){
        person.setPlaceOfBirth(placeOfBirth);
        return (T)this;
    }
    public T setCurrentAddress(String currentAddress){
        person.setCurrenntAddress(currentAddress);
        return (T) this;
    }

    public Person build(){
        return  this.person;
    }




}
