
Builder Pattern

Use Case - Consider a class having a large number of member variables out of which some are mandatory while others are optional. The constructor in such a class should provide the programmer to pass all the the optional variables which he intends to initialise to the constructor for creating the object. If the number of optional parameters is n, the total number of overloaded constructors required for satisfying every combination of optional parameter will be 2^n. Clearly having this large number of constructors is not practical/readable. One solution for this use case is to simply provide one constructor with all the parameter and the initiator needs to provide default/null values for the arguments he/she doesn't wish to pass. Such a constructor will have a large number of parameters which is difficult not only to write everytime you need to initialize an object but also not readable. The solution is the Builder Pattern.

Idea Behind Builder Pattern - Instead of having one constructor with all the parameters , the idea is to have one method for each variable which sets that variable in the object to be returned and returns the this reference which can be chained with other methods which also sets the variable and returns the this variable. Finally the builder can be terminated with a termination method usually named build() or execute() which finally returns the requested object.

Repository Structure and Explanation
/builder/simple - The Repo contains the following classes
 a) Person - The class contains few member variables such as firstName, lastName, placeOfBirth, middleName and currentAddress along with their corresponding getters   and setters and the toString() method. We will be building a Person Object using the SimplePersonBuilder which actually implements the Builder Pattern.
b) SimpleBuilderPerson - This is the actual Builder class demonstrating the builder Pattern. The class contains a build() method which returns the final formed Person object and other setter methods , which sets a property in person and return the SimplePersonBuilder reference which can be used to call the other setter methods. Once we have set all the parameters we want to set, we call the build() method and retrieve our object
c) SimplePersonBuilderDemo - Demo class which demonstrates the usage of SimplePersonBuilder
