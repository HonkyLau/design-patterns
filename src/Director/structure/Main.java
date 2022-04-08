package Director.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @date 2022/4/9
 */
public class Main {

    public static void main(String[] args) {
        //需要构建产品1
        Builder builder1 = new ConcreteBuild1();
        //需要构建产品2
        Builder builder2 = new ConcreteBuild2();

        Director director = new Director();
        //构建产品1
        director.build(builder1);
        //构建产品2
        director.build(builder2);

        Product result = builder1.getResult();
        result.show();
    }
}
