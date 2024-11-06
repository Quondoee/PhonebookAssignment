package Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private static Map<String, List<String>> phonebook;


    public Phonebook() {
        phonebook = new HashMap<>();
    }

    // Add a phone number for a name
    public static void add(String name, String phoneNumber) {
        if (!phonebook.containsKey(name)) {
            phonebook.put(name, new ArrayList<>());
        }

        phonebook.get(name).add(phoneNumber);
    }


    public static void addAll(String name, String... phoneNumbers) {
        for (String number : phoneNumbers) {
            add(name, number);
        }
    }


    public void remove(String name) {
        phonebook.remove(name);
    }


    public boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }


    public static List<String> lookup(String name) {

        return phonebook.getOrDefault(name, new ArrayList<>());
    }

    public String reverseLookup(String phoneNumber) {
        for (String name : phonebook.keySet()) {
            if (phonebook.get(name).contains(phoneNumber)) {
                return name;
            }
        }
        return null;
    }


    public List<String> getAllContactNames() {
        return new ArrayList<>(phonebook.keySet());
    }


    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}