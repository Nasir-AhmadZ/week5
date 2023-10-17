package ie.atu;

import java.util.Scanner;
public class Person {

    public Person() {
        this.firstname = "John/Jane";
        this.lastname = "Doe";
        this.age = 30;
    }


    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void DisplayInfo()
    {
        System.out.println("You entered "+getFirstname()+" "+getLastname()+" Age: "+getAge());
    }

    //getter and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstname = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastname = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

    }
    private String firstname;

    private String lastname;

    private int age;
}
