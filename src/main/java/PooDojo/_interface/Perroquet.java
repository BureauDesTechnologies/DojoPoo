package PooDojo._interface;

@SuppressWarnings("ALL")
public class Perroquet extends Oiseau implements PeutVoler, PeutParler {

    public Perroquet() {
        super();
    }

    public Perroquet(String nom) {
        super(nom);
    }

    @Override
    public void fly() {
        /* code to fly */
    }

    @Override
    public void speak() {
        System.out.println(this.nom);
    }
}
