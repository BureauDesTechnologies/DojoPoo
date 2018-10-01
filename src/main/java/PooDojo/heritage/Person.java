package PooDojo.heritage;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public abstract class Person {
    // Attributs
    private String nom;
    private String genre;
    private int age;
    private int money = 0;
    private boolean isRich = false;
    private ArrayList<Person> friends;

    public Person(String nom, int age, String genre) {
        this(nom, age, genre, new ArrayList<>());
    }

    public Person(String nom, int age, String genre, ArrayList<Person> friends) {
        this.nom = nom;
        this.age = age;
        this.genre = genre;
        this.friends = friends;
    }

    public boolean isRich() {
        return isRich;
    }

    /**
     * @param money - money to give to the person
     */
    public void setMoney(int money) {
        this.money = money;

        if (money > 1000)
            this.isRich = true;
    }

    public void addMoney(int m) {
        setMoney(this.money + m);
    }

    @Override
    public String toString() {
        return this.nom + ", " + this.genre + ", " + this.age + "ans";
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return age == person.age && nom.equals(person.nom);
    }
}
