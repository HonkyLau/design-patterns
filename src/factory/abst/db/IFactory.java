package factory.abst.db;

/**
 * @author liuhongji
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
