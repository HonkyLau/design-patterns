package AbstractFactory.jdbc;

/**
 * @author liuhongji
 */
public class MysqlStatement implements Statement {
    @Override
    public void executeQuery(String sql) {
        System.out.println("mysql exec statement query");
    }
}
