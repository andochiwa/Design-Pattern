# 责任链模式定义

使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到一个对象处理它位置

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Chain-Of-Responsibility/img.png)

`Handler` 定义一个处理请示的接口

`ConcreHandler` 具体处理者类，处理它所负责的请求，可访问它的后继者，如果可处理该请求就处理，否则就将请求转发给它的后继者