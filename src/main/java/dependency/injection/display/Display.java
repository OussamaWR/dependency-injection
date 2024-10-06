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
    }
}
