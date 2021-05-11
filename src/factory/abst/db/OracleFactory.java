package factory.abst.db;

/**
 * @author liuhongji
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
