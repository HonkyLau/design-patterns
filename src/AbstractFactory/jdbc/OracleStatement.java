package AbstractFactory.jdbc;

/**
 * @author liuhongji
 */
public class OracleStatement implements Statement {
    @Override
    public void executeQuery(String sql) {
        System.out.println("oracle exec statement query");
    }
}
