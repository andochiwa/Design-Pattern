# 组合模式定义

将对象组合成树形结构以表示'部分-整体'的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性

![img](https://github.com/andochiwa/Design-Pattern/blob/master/Composite-Pattern/img.png)

`Component`为组合中的对象声明接口，在适当情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理`Component`的子部件

`Leaf`在组合中表示叶结点对象，叶结点没有子节点

`Composite`定义有枝节点行为，用来存储子部件，在`Component`接口中实现与子部件有关的操作，比如add和remove

当发现需求中体现部分和整体有层次的结构时，就可以考虑使用组合模式