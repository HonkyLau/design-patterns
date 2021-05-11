# 23种设计模式

## 策略模式
### 在处理某些问题上，在不同时间需要应用不同的策略以及方式，就可以采用策略模式。
优点：
1. 将策略的具体实现放在子类中，再新增一种策略只需要增加一种具体的实现类；
2. 客户端只需要通过调用上下文context从而实现具体策略，耦合性低；
3. 可通过简单工厂模式生成上下文context的策略父类，或者提供切换策略的方式setXXX。

## 简单工厂模式（静态工厂方法模式）
### 定义一系列的产品，客户需要使用产品，而不关注产品如何生成，通过传入一个参数可以获产品对象。例如我是开一家甜品店，客户知道我这里可以做某种甜品，告诉我需要甜品名称，我就给他做好甜品。甜品店就是一个工厂，甜品就是产品。
优点：

1. 工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责；
2. 客户端无需知道所创建具体产品的类名，只需知道参数即可；
3. 也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。

适用场景：

1. 工厂类负责创建对的对象比较少，因为不会造成工厂方法中的业务逻辑过于复杂。

## 工厂方法模式
### 工厂方法使一个类的实例化延迟到抽象工厂类的子类，是定义一个用于创建对象的接口。
优点：
1. 对比简单工厂，不需要修改工厂类；
2. 适合创建对象多的情况。

缺点：
1. 需要修改客户端生成所需要的对象工厂，再生成对象。

## 抽象工厂模式

适用场景：

1. 抽象工厂是针对多个产品系列的问题。