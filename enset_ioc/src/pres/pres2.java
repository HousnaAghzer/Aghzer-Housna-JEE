package pres;

import dao.IDao;
import metier.IMetier;
import org.omg.CORBA.Object;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine(); //Le nom de la classe
        Class cDao=Class.forName(daoClassName); //Charger la classe en mémoire
        IDao dao=(IDao) cDao.newInstance(); //Instanciation dynamique de la classe

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method= cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);
        System.out.println("Résultat=>"+metier.calcul());
    }
}
