package AbstractFactory.jdbc;

/**
 * @author liuhongji
 */
public class MysqlConnection implements Connection{
    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }

    @Override
    public PreparedStatement createPrepareStatement() {
        return new MysqlPrepareStatement();
    }

}
