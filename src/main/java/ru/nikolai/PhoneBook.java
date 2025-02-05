package ru.nikolai;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, Integer> contacts;

    public PhoneBook(){
        contacts = new HashMap<String, Integer>(50);
    }

    public void add(String name, Integer phoneNumber) {
        contacts.put(name,phoneNumber);
    }

    public String findByNumber(Integer number) {
        for (String key : contacts.keySet()) {
            int val = contacts.get(key);
            if (val == number){
                return key;
            }
        }
        return null;
    }

    public Integer findByName (String name){
        return contacts.get(name);
    }
}
