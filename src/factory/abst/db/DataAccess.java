package factory.abst.db;

/**
 * @author liuhongji
 */
public class DataAccess {
    
    private static final String db = "Mysql";
    
    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IUser)Class.forName("factory.abst.db." + db + "User").newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IDepartment)Class.forName("factory.abst.db." + db + "Department").newInstance();
    }
}
