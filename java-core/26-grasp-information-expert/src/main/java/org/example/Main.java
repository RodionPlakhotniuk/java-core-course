package org.example;

public class Main {
    public static void main(String[] args) {

        User user = new User("Rodion Plakhotniuk", 22);
        Address address = new Address("20th anniversary of the victory of 88/88");

        user.setAddress(address);

        System.out.printf("%s (%d y.o.) address: %s%n", user.getFullName(), user.getAge(), user.getAddress());
    }
}
