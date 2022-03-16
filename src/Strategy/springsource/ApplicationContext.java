package Strategy.springsource;

/**
 * spring上下文
 *
 * @author liuhongji
 * @version 1.0
 */
public abstract class ApplicationContext implements ResourceLoader{

    @Override
    public Resource getResource(String location) {
        if(location.startsWith("classpath:")){
            return new ClassPathResource();
        }else{
            return new UrlResource();
        }
    }
}
