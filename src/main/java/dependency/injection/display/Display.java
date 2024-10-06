package dependency.injection.display;

import dependency.injection.dao.DaoImpl;
import dependency.injection.dao.IDao;
import dependency.injection.metier.MetierImpl;

public class Display {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        DaoImpl dao = new DaoImpl();
        metier.setDao(dao);
        double  data = metier.calcul();
        System.out.println("data => "+data);


        // ___________________________________________________
        DaoImpl dao2 = new DaoImpl();
        MetierImpl metier2 = new MetierImpl(dao2);
        double data2 = metier2.calcul();
        System.out.println("data2 => "+data2);

    }
}
