# 中介模式定义

用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式的互相引用，从而使其耦合松散，而且可以独立地改变它们之间的交互

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Mediator-Pattern/img.png)

`Colleague`叫做抽象同事类，`ConcreteColleague`为具体同事类，每个具体同事类只知道自己的行为，而不了解其他同事类的情况，但它们都认识中介者对象

`Mediator`是抽象中介者，定义了同事对象到中介者对象的接口

`ConcreteMediator`为具体中介者对象，实现抽象类的方法，它需要知道所有具体同事类，并从具体同事接受消息，向具体同事对象发出命令