# Java Concurrent Learning Note

## 捕获线程异常
   * Thread.UncaughtExceptionHandler.uncaughtException() 会在线程因未捕获的异常而临近死亡时被调用。
   * 递增程序自身也需要多个步骤。递增不是原子性的操作(i++)。

## 资源共享
   * 对某个特定的对象，其所有的synchronized 方法共享同一个锁。例如f() 和g()，只有当f() 的调用锁被释放时，其他对象才可以调用f() 或g()。
   * 针对每个类，也有一个锁（作为类的Class 对象的一部分），所以synchronized static 方法可以在类的范围内防止对static 数据的并发访问。
   * Brian 同步规则，如果你正在写一个变量，它可能接下来被另一个线程读取，或者正在读取一个上一次已经被另一个线程写过的变量，那么你必须使用同步，并且，读写线程都必须用相同的监视器锁同步。

## 原子性与易变性
   * JVM 可以将64位（long 和double 变量）读取和写入当作两个分离的32位操作来执行，就会产生一个读取和写入操作中间发生上下文切换。有时被称为字撕裂。当定义long 或double 时，使用volatile 关键字，就会获得原子性。
   * 如果一个域完全由synchronized 方法或语法块来防护，那就不必要设置为volatile。同步会将将其刷新到主存中。
   * 对域中的值做赋值和返回操作通常都是原子性的。
   * 通过使用同步控制块，而不是对整个方法进行同步控制，可以使多任务访问对象的时间性能得到显著提高。
   * synchronized 不属于方法特征签名的组成部分，可以在实现时加上去。
   * volatile 只解决了数据存储的同步问题，因此对于++i 这种操作，不能保证线程安全。
   
## 线程本地存储
   * ThreadLocal 对象通常当作静态域存储，每个单独的线程都会分配自己的存储空间。
   
## 线程状态
   * 一个线程可以处于新建(new),就绪(runnalbe),阻塞(blocked)和死亡(Dead)。
   * 能够中断(Future.cancel(true))任何要求抛出InterruptedException 的调用，不能中断正在试图获取synchronized 锁或执行I/O。
   * this.interrupted() 测试当前线程是否已经是中断状态。执行后具有将状态标志清除为false 的功能。
   * this.isInterrupted() 测试线程Thread 对象是否已经是中断状态，但不清楚状态标志。
   * 线程优先级的集成特性，如果A 集成自B 线程，则A 拥有与B 相同的优先级。
   * 
