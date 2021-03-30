# 命令模式定义

将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化：对请求排队或记录请求日志，以及支持可撤销的操作

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Command-Pattern/img.png)

`Command` 用来声明执行操作的接口

`ConcreCommand` 将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现execute

`Invoker` 要求命令执行该请求

`Receiver` 知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者