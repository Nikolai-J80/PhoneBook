package ru.nikolai;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

    public void printAllNames(){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(contacts);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
