package ie.atu;

public class Person {

    public Person() {
        this.firstname = " ";
        this.lastname = " ";
        this.age = 0;
    }


    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    String firstname;

    String lastname;

    int age;
}
