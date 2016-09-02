# Java Concurrent Learning Note

## 捕获线程异常
   * Thread.UncaughtExceptionHandler.uncaughtException() 会在线程因未捕获的异常而临近死亡时被调用。
   * 递增程序自身也需要多个步骤。递增不是原子性的操作(i++)。

## 资源共享
   * 对某个特定的对象，其所有的synchronized 方法共享同一个锁。例如f() 和g()，只有当f() 的调用锁被释放时，其他对象才可以调用f() 或g()。
   *
