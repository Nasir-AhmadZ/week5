package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person first = new Person("Paul","Lennon",21);
        first.DisplayInfo();
        Person second = new Person();
        second.DisplayInfo();
        Person third = new Person();
        third.getUserInput();
        third.DisplayInfo();
        }
    }