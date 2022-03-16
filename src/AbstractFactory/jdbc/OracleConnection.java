package AbstractFactory.jdbc;

/**
 * @author liuhongji
 */
public class OracleConnection implements Connection {
    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }

    @Override
    public PreparedStatement createPrepareStatement() {
        return new OraclePrepareStatement();
    }
}
