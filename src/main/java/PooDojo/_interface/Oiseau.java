package PooDojo._interface;

@SuppressWarnings("ALL")
public abstract class Oiseau {

    String nom;

    public Oiseau() {
        this.nom = this.getClass().getSimpleName();
    }

    public Oiseau(String nom) {
        this.nom = nom;
    }
}
