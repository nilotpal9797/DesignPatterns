public class SimplePersonBuilder<T extends SimplePersonBuilder<T>> {
    protected Person person;

    public SimplePersonBuilder(Person person){
        this.person = person;
    }
    public SimplePersonBuilder(){

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
