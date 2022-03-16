package AbstractFactory.db;

/**
 * @author liuhongji
 */
public class MysqlDepartment implements IDepartment{

    @Override
    public void insertDepartment(Department department) {
        System.out.println("insert department into mysql");
    }

    @Override
    public void getDepartment(Long id) {
        System.out.println("get department from mysql");
    }
}
