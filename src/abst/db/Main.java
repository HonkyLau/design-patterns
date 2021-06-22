package abst.db;

/**
 * @author liuhongji
 */
public class Main {

    public static void main(String[] args) {

        try {
            IUser user = DataAccess.createUser();
            user.insertUser(new User());
            IDepartment department = DataAccess.createDepartment();
            department.insertDepartment(new Department());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
