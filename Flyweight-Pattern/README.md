# 享元模式定义

运用共享技术有效地支持大量细粒度的对象

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Flyweight-Pattern/img.png)

如果一个应用程序使用了大量的对象，而大量的对象造成了很大的存储开销就应该考虑使用享元模式。

对象的大多数状态可以为外部状态，如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象，此时可以考虑享元模式