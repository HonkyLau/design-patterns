package AbstractFactory.db;

/**
 * @author liuhongji
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
