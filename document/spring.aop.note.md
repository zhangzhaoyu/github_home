# Spring AOP Learning Note
## 基础知识
- 被定义为@PointCut 的方法的返回参数必须是Void 类型
- PointCut Expression 标注的方法的可见性(public, protected, defalut, private)，对引用此PointCut对应的方法同样适用
- PointCut 能够结合`&&, ||, !` 使用

## PointCut Expression
### 指示器列表
- execution()
- within()
- this()
- target()
- args()
- annotation()
- bean()

### 指示器的分类
- 分类指示器(kinded designators)
- 范围指示器(scoping designators)
- 上下文指示器(contextual designators)

## Advice 类别
- @Before
- @AfterReturning
- @AfterThrowing
- @After 不管一个方法执行完，还是抛出异常都要被执行。通常用在释放资源。
- @Around 可以在一个方法执行前后被调用，通常用在需要在线程安全的环境下在一个方法执行前后进行操作。例如开启和关闭一个Timer。

## ASM 介绍
ASM 是一个Java 字节码操控框架。能够被用来动态生成类或者增强既有类的功能。



