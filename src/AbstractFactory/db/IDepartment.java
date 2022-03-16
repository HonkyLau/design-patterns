package AbstractFactory.db;

/**
 * @author liuhongji
 */
public interface IDepartment {

    void insertDepartment(Department department);

    void getDepartment(Long id);
}
