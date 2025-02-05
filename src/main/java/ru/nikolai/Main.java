package ru.nikolai;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Nik",888555);
        pb.add("Pit",772255);
        pb.add("Bob",156664);

        System.out.println("Номер 156664 у абонента " + pb.findByNumber(156664));
    }
}