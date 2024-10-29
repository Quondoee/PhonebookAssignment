package Phonebook;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add("Dayquon", "123-456-7890");
        phonebook.add("Kendrick", "987-654-3210");
        phonebook.add("Drake", "555-555-5555");

        System.out.println("Dayquon's phone numbers: " + phonebook.lookup("Dayquon"));

        System.out.println("Does Kendrick have an entry? " + phonebook.hasEntry("Kendrick"));

        String phoneNumber = "987-654-3210";
        System.out.println("Who owns the number " + phoneNumber + "? " + phonebook.reverseLookup(phoneNumber));

        phonebook.remove("Drake");
        System.out.println("Does Drake have an entry after removal? " + phonebook.hasEntry("Drake"));
    }
}