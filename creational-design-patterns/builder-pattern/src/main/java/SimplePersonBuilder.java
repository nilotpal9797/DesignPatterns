public class SimplePersonBuilder {
    private Person person = new Person();

    public SimplePersonBuilder setFirstName(String firstName){
        person.setFirstName(firstName);
        return this;
    }
    public SimplePersonBuilder setMiddletName(String middletName){
        person.setMiddleName(middletName);
        return this;
    }
    public SimplePersonBuilder setLastName(String lastName){
        person.setLastName(lastName);
        return this;
    }
    public SimplePersonBuilder setPlaceOfBirth(String placeOfBirth){
        person.setPlaceOfBirth(placeOfBirth);
        return this;
    }
    public SimplePersonBuilder setCurrentAddress(String currentAddress){
        person.setCurrenntAddress(currentAddress);
        return this;
    }

    public Person build(){
        return this.person;
    }




}
