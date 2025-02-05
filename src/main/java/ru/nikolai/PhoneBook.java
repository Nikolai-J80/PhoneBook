package ru.nikolai;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, Integer> contacts;

    public PhoneBook(){
        contacts = new HashMap<String, Integer>(50);
    }

    public void add(String name, Integer phoneNumber) {
        contacts.put(name,phoneNumber);
    }

    public Integer findByNumber(Integer number) {
        return null;
    }
}
