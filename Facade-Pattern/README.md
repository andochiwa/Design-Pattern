# 外观模式定义

为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易复用

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Facade-Pattern/img.png)

- `SubSystem`子系统角色。表示一个系统的子系统或模块。
- `Facade`外观角色，客户端通过操作外观角色从而达到控制子系统角色的目的。对于客户端来说，外观角色好比一道屏障，对客户端屏蔽了子系统的具体实现