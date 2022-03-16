package AbstractFactory.db;

/**
 * @author liuhongji
 */
public class OracleUser implements IUser{

    @Override
    public void insertUser(User user) {
        System.out.println("insert user into oracle");
    }

    @Override
    public void getUser(Long id) {
        System.out.println("get user from oracle");
    }
}
