package dependency.injection.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("example of database version");
        double temp = 23;
        return temp;
    }
}
