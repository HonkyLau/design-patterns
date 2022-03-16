package AbstractFactory.jdbc;

/**
 * @author liuhongji
 */
public class OraclePrepareStatement implements PreparedStatement{


    @Override
    public void executeQuery(String sql) {
        System.out.println("oracle exec pre query");
    }
}
