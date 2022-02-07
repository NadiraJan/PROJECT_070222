package be.Intecbrussel;

public class Strings {

    //we maken methode
    public static void main(String[] args) {
        System.out.println("Before method invocation");
        greetings();

        greetPerson("Alex");
        greetPerson("Bart");
        System.out.println("After method invocation");
    }

    public static void greetings() {
        System.out.println("Hello");


}
public static void greetPerson(String name){
        System.out.println("Hello, " + name);
    }




}
