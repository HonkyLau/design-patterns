package AbstractFactory.db;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 用反射技术去除switch和if
 * 反射是去除if和switch最佳实现
 *
 *
 * @author liuhongji
 */
public class DataAccess {
    
    private static final String db;

    static {
        Properties properties = new Properties();
        InputStream in = DataAccess.class.getClassLoader()
                .getResourceAsStream("AbstractFactory/db/config.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        db = properties.getProperty("DB");
    }

    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IUser)Class.forName("factoryabstract.db." + db + "User").newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IDepartment)Class.forName("factoryabstract.db." + db + "Department").newInstance();
    }
}
