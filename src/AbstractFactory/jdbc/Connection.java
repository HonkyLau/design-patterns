package AbstractFactory.jdbc;

/**
 * 代表数据库连接对象，每个Connection代表一个物理连接会话
 *
 * @author liuhongji
 */
public interface Connection {

    Statement createStatement();
    PreparedStatement createPrepareStatement();

}
