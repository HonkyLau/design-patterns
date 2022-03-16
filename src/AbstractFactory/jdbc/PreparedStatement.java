package AbstractFactory.jdbc;

/**
 * 预编译的Statement对象
 *
 * @author liuhongji
 */
public interface PreparedStatement extends Statement{

    @Override
    void executeQuery(String sql);
}
