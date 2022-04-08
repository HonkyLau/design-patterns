package Director.structure;

/**
 *
 * 指挥者类，负责指挥如何构建一个产品/实例
 *
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class Director {

    public void build(Builder builder){
        //构建产品的工序A
        builder.buildPartA();
        //构建产品的工序A
        builder.buildPartB();
    }

}
