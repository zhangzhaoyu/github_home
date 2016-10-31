# ZooKeeper Learning Note

## Zookeeper install
   * config zoo.cfg
   * 配置环境变量，将bin 目录添加到PATH
   * zkServer.sh start 启动，默认在后台运行
   * zkServer.sh start-foreground 在前台运行
   * zkServer.sh status 查看状态
   * zkServer.sh stop 停止
   * zkServer.sh restart 重启   

## ZooKeeper 功能概述
   * 保障强一致性、有序性和持久性。
   * 实现通用的同步原语的能力。
   * 在实际的分布式系统中，并发往往导致不正确的行为。ZooKeeper 提供了一种简单的并发处理机制。

## 分布式系统进程通信
   * 分布式系统进程通信有直接通过网络进行信息交换和读写某些共享存储。网络是分布式系统中并发设计的基础。
