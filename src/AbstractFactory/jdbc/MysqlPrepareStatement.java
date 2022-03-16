package AbstractFactory.jdbc;

/**
 * @author liuhongji
 */
public class MysqlPrepareStatement implements PreparedStatement{


    @Override
    public void executeQuery(String sql) {
        System.out.println("mysql exec pre query");
    }
}
