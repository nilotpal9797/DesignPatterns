public class SimplePersonBuilderDemo {

    public static void main(String[] args) {
        SimplePersonBuilder simpleBuilder = new SimplePersonBuilder(new Person());
        Person person = simpleBuilder.setFirstName("Alex")
            .setMiddletName("Kumar")
            .setLastName("Mahone")
            .setPlaceOfBirth("Bhatinda")
            .setCurrentAddress("Ludhiana")
            .build();
        System.out.println(person);
    }

}
