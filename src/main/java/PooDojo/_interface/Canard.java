package PooDojo._interface;

@SuppressWarnings("ALL")
public class Canard extends Oiseau implements PeutParler{

    public Canard(){
        super();
    }

    public Canard(String nom) {
        super(nom);
    }

    @Override
    public void speak() {
        System.out.println("Coin coin !");
    }
}
