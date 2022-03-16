package TemplateMethod.structure;

/**
 * @author liuhongji
 * @version 1.0
 * @2022/3/15
 */
public class Main {
    public static void main(String[] args) {
        AbstClass abstClass = new AbstImpl();
        abstClass.templateMethod();
    }
}

