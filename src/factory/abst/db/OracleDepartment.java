package factory.abst.db;

/**
 * @author liuhongji
 */
public class OracleDepartment implements IDepartment{

    @Override
    public void insertDepartment(User user) {
        System.out.println("insert department into oracle");
    }

    @Override
    public void getDepartment(Long id) {
        System.out.println("get department from oracle");
    }
}
