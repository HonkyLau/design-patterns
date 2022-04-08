package Director.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，多个步骤/构件组成一个产品
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class Product {

    private List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println(parts);
    }

}
