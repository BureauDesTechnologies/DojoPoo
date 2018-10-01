package PooDojo;

import PooDojo.heritage.Person;
import PooDojo.heritage.Student;
import PooDojo.heritage.Teacher;

import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("ALL")
public class Main {

    public static Person person1 = new Student("bob", 18, "Homme");
    public static Person person2 = new Teacher("alice", 19, "Femme");
    public static ArrayList<Person> personList2 = new ArrayList<>();

    public static void main(String[] args) {

        //----------------------------------------------------//
        //=============== Niveau de protection ===============//

        // public       => Accès depuis toutes les classes
        // "rien"       => Accès depuis le package (dossier de la classe)
        // protected    => Accès depuis cette classe + filles (extends)
        // private      => Accès depuis cette classe


        //--------------------------------------------------------//
        // =============== Options sur les classes ===============//

        // abstract     => Ne peut pas être instanciée, mais peut avoir des méthodes abstraites
        // extends      => Obtiens le 'type', les attributs et les méthodes de la classe
        // implements   => Doit implémenter les méthodes abstraites

        //-------------------------------------------------//
        //=============== Les types de Java ===============//

        //Les primitifs :
        int i;      // nombre entier
        float f;    // nombre décimal
        double d;   // nombre décimal (plus grand)
        boolean b;  // valeur "true" ou "false" uniquement
        char c;     // charactère seul (ex : 'a', '5', '$')
        short s;
        long l;
        byte by;

        //---------------------------------------------------------

        //Leurs équivalents en objets :
        Integer integer;
        Float aFloat;
        Double aDouble;
        Boolean aBoolean;
        String string;      // Représente une chaine de charactères (ex : "bonjour", "a", "123ABC")
        //etc...

        //---------------------------------------------------------

        //Les tableaux :
        int tabInts[];
        Person peopleTab[];
        //Pour les initialiser :
        int t[] = new int[]{};
        int t2[] = new int[10];
        peopleTab = new Person[]{person1, person2};

        //---------------------------------------------------------

        //Listes et autres :
        ArrayList<Person> personList = new ArrayList<>();           // Entre < > on met le type de la liste. Ça doit être un Objet !
        HashMap<String, Person> locations = new HashMap<>();    // Idem mais avec deux types : permet de faire des couples <A, B>
                                                                // (nécessite d'implémenter 'equals' et 'hashcode')

        //---------------------------------------------------------

        //Méthodes des Listes :
        personList.contains(person1);       // "true" si la liste contient person1
        personList.isEmpty();               // "true" si la liste est vide
        personList.add(person1);            // ajoute person1 à la liste
        personList.add(1, person1);         // ajoute person1 à la liste, à l'index 1
        personList.addAll(personList2);     // ajoute la liste personList2 à personList
        personList.remove(1);               // retire l'objet Person à l'index 1
        personList.remove(person1);         // retire la person1 de personList
        personList.get(1);                  // obtient l'objet Person à l'index 1
        personList.indexOf(person1);        // obtient l'index de person1
        personList.clear();                 // vide la liste personList
    }
}
