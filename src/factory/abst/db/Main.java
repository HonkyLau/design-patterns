package factory.abst.db;

/**
 * @author liuhongji
 */
public class Main {

    public static void main(String[] args) {

        try {
            IUser user = DataAccess.createUser();
            user.insertUser(new User());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
