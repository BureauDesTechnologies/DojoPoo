package PooDojo._interface;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        Perroquet perroquet = new Perroquet("Coco");
        Canard canard = new Canard();
        Canard canardAnglais = new CanardAnglais();

        ArrayList<PeutParler> oiseauxParlant = new ArrayList<>();
        oiseauxParlant.add(perroquet);
        oiseauxParlant.add(canard);
        oiseauxParlant.add(canardAnglais);

        for (int i = 0; i < oiseauxParlant.size(); i++) {
            oiseauxParlant.get(i).speak();
        }

        for (PeutParler parleur : oiseauxParlant) {
            parleur.speak();
        }

        oiseauxParlant.forEach((parleur) -> {
            parleur.speak();
        });

        oiseauxParlant.forEach((parleur) -> parleur.speak());

        oiseauxParlant.forEach(PeutParler::speak);
    }
}
