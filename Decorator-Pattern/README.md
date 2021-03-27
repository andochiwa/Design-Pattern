# 定义

允许动态的向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装

![image](https://github.com/andochiwa/Design-Pattern/blob/master/Decorator-Pattern/image.png)



`Component`是定义一个对象接口，可以给这些对象动态地添加职责

`ConcreteComponent`是定义了一个具体对象，也可以给这个对象添加一些职责

`Decorator`是装饰抽象类，实现了`Component`接口，从外类来扩展`Component`类的功能，但对于`Component`来说，无需知道`Decorator`的存在

`ConcreteDecorator`就是具体的装饰对象，起到给`Component`添加职责的功能



需求2：有一个Human接口，一个接口实现类Man，Human可以跑，但不能飞，现在要增加人可以飞的功能

**使用场景**：

- 替代继承，扩展一个类的功能
- 动态的给一个对象添加功能，以及动态的撤销该功能

**优点**：

- 动态扩展一个实现类的功能，在不需要添加功能的时候，可以撤销装饰。
- 装饰类和被装饰类模块间，通过抽象产生依赖，不会相互耦合
- 装饰模式替换继承，可以避免继承链的子类被影响

