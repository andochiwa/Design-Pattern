# 抽象工厂模式定义

提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体的类

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Abstract-Factory-Pattern/img.png)

`AbstractProductA`和`AbstractProductB`是两个抽象产品，`ProductA1`,`ProductA2`，`ProductB1`，`ProductB2`是对两个抽象产品具体分类的实现

`IFactory`是抽象工厂接口，里面应该包含所有产品创建的抽象方法。

`ConcreteFactory1`和`ConcreteFactory2`是具体的工厂