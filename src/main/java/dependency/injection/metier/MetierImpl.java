package dependency.injection.metier;

import dependency.injection.dao.DaoImpl;
import dependency.injection.dao.IDao;

public class MetierImpl  implements  IMetier{
    // instead  of using DaoImp we will use the  interface IDao (couplage faible)

    private IDao dao;

    /** for inject to our attribute doa an object
     * of the class that will implement the interface IDao
     * this setter will facilitate dependency injection
     */
    public void setDao(IDao dao){
        this.dao = dao;
    }

    public MetierImpl(IDao dao){
        this.dao = dao;
    }

    public MetierImpl(){
        this.dao = null;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*23;
        return res;
    }
}
