package factory.abst.db;

/**
 * @author liuhongji
 */
public interface IUser {

    void insertUser(User user);

    void getUser(Long id);
}
