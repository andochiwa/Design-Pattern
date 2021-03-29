# 备忘录模式定义

在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态

可以理解为撤销操作

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Memento-Pattern/img.png)

`Originator(发起人)` 负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。`Originator`可根据需要决定Memento存储`Originator`的哪些内部状态

`Memento(备忘录)` 负责存储`Originator`对象的内部状态，并可放置`Originator`以外的对象访问备忘录`Memento`。备忘录有两个接口，`Caretaker`只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。`Originator`能够看到一个宽接口，允许它访问先前状态所需的所有数据

`Caretaker(管理者)` 负责保存好备忘录`Memento`，不能对备忘录的内容进行操作或检查