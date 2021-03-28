# 模板方法模式定义

定义一个操作中的算法的骨架，将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤

![img](https://github.com/andochiwa/Design-Pattern/tree/master/Template-Method-Pattern/img.png)

`AbstractClass`是抽象类，也就是一套算法模板，定义并实现了一个模板方法。这个模板方法一般是一个具体的方法，它给出了一个顶级逻辑的骨架，而逻辑组成的步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也有可能调用一些具体方法。

`ConcreteClass` 实现父类所定义的一个或多个抽象方法，每一个`AbstractClass`都可以有任意多个`ConcreteClass`与之对应，而每一个`ConcreteClass`都可以给出这些抽象方法的不同实现，从而使得顶级逻辑的实现各不相同

模板方法模式是通过把不变行为搬移到父类，去除子类中的重复代码，从而提供一个很好的代码复用平台