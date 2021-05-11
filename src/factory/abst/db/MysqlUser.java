package factory.abst.db;

/**
 * @author liuhongji
 */
public class MysqlUser implements IUser{

    @Override
    public void insertUser(User user) {
        System.out.println("insert user into mysql");
    }

    @Override
    public void getUser(Long id) {
        System.out.println("get user from mysql");
    }
}
