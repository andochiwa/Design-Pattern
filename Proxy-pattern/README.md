# 定义

为其他对象提供一种代理以控制对这个对象的访问

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Proxy-Pattern/img.png)



`Subject`类定义了`RealSubject`和`Proxy`的共用接口，这样就可以在任何使用`RealSubject`的地方都使用proxy