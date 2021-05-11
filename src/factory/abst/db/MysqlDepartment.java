package factory.abst.db;

/**
 * @author liuhongji
 */
public class MysqlDepartment implements IDepartment{

    @Override
    public void insertDepartment(User user) {
        System.out.println("insert department into mysql");
    }

    @Override
    public void getDepartment(Long id) {
        System.out.println("get department from mysql");
    }
}
