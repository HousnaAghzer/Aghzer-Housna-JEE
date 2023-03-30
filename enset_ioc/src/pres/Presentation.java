package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
       /*
       Injection des dépendances par instanciation statique
       => new (Couplage Fort)
        */
        DaoImpl2 dao= new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultats="+metier.calcul());
    }
}
