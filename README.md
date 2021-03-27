# 23种设计模式

## 创建型模式

* [工厂方法模式（Factory Method Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Factory-Method-Pattern)
* [抽象工厂模式（Abstract Factory Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Abstract-Factory-Pattern)
* [单例模式（Singleton Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Singleton-Pattern)
* [建造者模式（Builder Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Builder-Pattern)
* [原型模式（Prototype Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Prototype-Pattern)

## 结构型模式

* [适配器模式（Adapter Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Adapter-Pattern)
* [装饰器模式（Decorator Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Decorator-Pattern)
* [代理模式（Proxy pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Proxy-pattern)
* [外观模式（Facade Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Facade-Pattern)
* [桥接模式（Bridge Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Bridge-Pattern)
* [组合模式（Composite Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Composite-Pattern)
* [享元模式（Flyweight Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Flyweight-Pattern)

## 行为型模式

* [策略模式（Strategy Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Strategy-Pattern)
* [模板方法模式（Template Method Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Template-Method-Pattern)
* [观察者模式（Observer Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Observer-Pattern)
* [迭代器模式（Iterator Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Iterator-Pattern)
* [责任链模式（Chain Of Responsibility Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Chain-Of-Responsibility)
* [命令模式（Command Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Command-Pattern)
* [备忘录模式（Memento Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Memento-Pattern)
* [状态模式（State Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/State-Pattern)
* [访问者模式（Visitor Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Visitor-Pattern)
* [中介模式（Mediator Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Mediator-Pattern)
* [解释器模式（Interpreter Pattern）](https://github.com/andochiwa/Design-Pattern/tree/master/Interpreter-Pattern)

# 面向对象设计模式原则

* [单一职责原则（Single responsibility principle）](#1)
* [开放封闭原则（The Open Closed Principle）](#2)
* [依赖倒转原则（Dependence Inversion Principle）](#3)
* [里氏代换原则（Liskov Substitution Principle LSP）](#4)



# <span id="1"> 单一职责原则 </span>

一个类应该只有一个发生变化的原因，如果一个类具有一个以上的职责，则应该考虑职责分离



# <span id="2">开放封闭原则 </span>

软件实体应该是可扩展，而不可修改的。也就是说，对扩展是开放的，而对修改是封闭的

主要体现在两个方面：

1. 对扩展开放，意味着有新的需求或变化时，可以对现有代码进行扩展，以适应新的情况。
2. 对修改封闭，意味着类一旦设计完成，就可以独立完成其工作，而不要对类进行任何修改。



# <span id="3">依赖倒转原则</span>

程序要依赖于抽象接口，不要依赖于具体实现。简单的说就是要求对抽象进行编程，不要对实现进行编程，这样就降低了客户与实现模块间的耦合

 

# <span id="4">里氏代换原则</span>

一个软件实体如果使用的是一个父类的话，那么一定适用于其子类，而且它察觉不出父类对象和子类对象的区别。

也就是说，在软件里，把父类都替换成它的子类，程序的行为也没有变化，**子类必须能够替换它的父类**