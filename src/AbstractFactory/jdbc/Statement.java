package AbstractFactory.jdbc;

/**
 * 执行sql语句的工具接口
 *
 * @author liuhongji
 */
public interface Statement {

    void executeQuery(String sql);
}
