package dependency.injection.metier;

import dependency.injection.dao.DaoImpl;
import dependency.injection.dao.IDao;

public class MetierImpl  implements  IMetier{
    // instead  of using DaoImp we will use the  interface IDao (couplage faible)

    private IDao dao;

    @Override
    public double calcul() {
        double data = dao.getData();
        return 0;
    }
}
