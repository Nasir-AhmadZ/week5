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
        System.out.println("You entered "+firstname+" "+lastname+" "+age);
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
    String firstname;

    String lastname;

    int age;
}
