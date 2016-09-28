# Redis学习笔记
## 1 redis install 
### 1.1 step
    - wget http://download.redis.org/releases/redis-3.0.6.tar.gz
    - tar -zxvf redis-3.0.6.tar.gz
    - cd redis-3.0.6
    - make

### 1.2 Redis作为开机服务启动
    - emacs /etc/rc.local
    - add redis-server path: /usr/local/redis-3.0.6/src/redis-server

### 1.3 Redis 停止
    如果没有这么严格的实时性要求，可以设置为yes，以便能够尽可能快的释放内存


## 6 string类型及操作
   - set name tramp
   - setnx name tramp_new 如果不存在则跟新
   - setex session 10 tramp 设置键值的过期时间
   - setrange 设定指定key的value值的字符串
   - mset 一次设置多个key的值
   - msetnx 同setnx
   - get name 获取key对应的string值
   - getset name tramp_new 获取旧值并设置新值
   - getrange 获取制定key的value值的子字符串
   - mget 一次获取多个key的值
   - incr key的value必须为int,不存在时设置为1
   - incrby key不存在时会设置key,并人为原来的value是0
   - decr 对key的值做减减操作,decr一个不存在的key,则设为-1
   - decrby 对key的减去指定的值,不存在时默认为0
   - append 追加字符串
   - strlen 获取制定的key的value的长度


## 7 hashes类型及操作
   - hset myhash field1 hello 如何field不存在，则创建
   - hsetnx myhash fields hello 如果field不存在，则创建。如果存在，返回0
   - hmset myhash fiedl1 hello field2 world 同时设置多个hash的field
   - hget myhash field1
   - hmget myhash field1 field2 获取多个field的值
   - hincrby myhash field3 -8 添加指定的值
   - hexists myhash field1 判断field是否存在
   - hlen myhash 返回指定hash的field数量
   - hkeys myhash 返回所有field
   - hvals myhash 返回hash的所有value
   - hgetakk myhash 获取hash的全部field和value



## 8 lists类型及操作
    - 操作中的key可理解为链表的名字。该链表的实质就是每个子元素都是string的双向链表。链表最大长度是2的32次方。我们可以通过push，pop从链表的头部或尾部添加删除元素。这使得list 既可以用做栈，也可以用作队列
    - pop提供了阻塞版本，阻塞操作可以避免轮询带来的延迟
    - lpush mylist hello 在list的头部添加
    - rpush mylist hello 在list的尾部添加
    - linsert mylist before hello world 在指定位置插入
    - lset mylist 0 hello 设置制定下标的元素值
    - lrem mylist 2 hello 从key对应list中删除count个和value相同的元素，count>0时，从头到尾删除。count<0时，按从尾到头的顺序删除。count=0时，全部删除
    - ltrim mylist 1 3 保留指定key的值范围内的数据
    - lpop mylist 从list的头部删除元素，并返回删除元素
    - rpoplpush mylist1 mylist2 从第一个list的尾部移出元素并添加到第二个list的头部，最后返回被移除的元素值，整个操作是原子的。如果第一个list是空或者不存在返回nil
    - lindex mylist 0 返回list中index位置的元素
    - llen mylist 返回list的长度


## 9 sets类型及操作
    - set是string类型的无序集合，最大长度可以包含2的32次个元素，采用hashtable实现
    - sadd myset hello
    - srem myset hello 删除名称为key的set中的元素member
    - smembers myset 查看所有元素
    - spop myset 随机返回并删除名称为key的set中的一个元素
    - sdiff myset1 myset2 返回所有给定key与第一个key的差集
    - sdiffstore resultset myset2 myset3 返回所有给定key与第一个key的差集，并将结果存为另一个key
    - sinter myset2 myset3 返回所有给定key的交集
    - sinterstore resultset myset1 myset3
    - sunion myset1 myset2 求并集
    - sunionstore resultset myset1 myset2
    - smove myset myset2 element 从第一个key对应的set中移除memeber并添加到第二个对应的set中
    - scard myset 返回set元素个数
    - sismember myset element 测试是否为set中元素
    - srandmember myset 随机返回名称为key的set的一个元素，但是不删除元素


## 10 sorted sets类型及操作
    - zadd myzset 1 one 向名称为key的zset中添加元素memeber，score用于排序
    - zrem myzset one 删除
    - zincrby myzset 2 one 增加值
    - zrank myzset two 返回排名(按score从小到大排序)
    - zrevrank myzset two 返回排名(按score从大到小排序)
    - zrevrange myzset 0 -1 withscores 按下标，从小到大
    - zrangebyscore 返回集合中score在给定区间的元素
    - zcount myzset 1 3 返回集合中score在给定区间的数量
    - zcard myzset 返回集合中元素个数
    - zscore myzset element 返回给定元素的score
    - zremrangebyrank myzset 2 4 删除集合中排名在给定区间的元素
    - zremrangebyscore myzset 1 2 删除集合中score在给定区间的元素


## 11 Redis常用命令
    - keys * 返回满足给定pattern的所有key
    - exists key 确定key是否存在
    - expire key 10 设置一个key的过期时间，单位：秒
    - ttl key 获取key的有效时长
    - move key db 将当前数据库中的key转移到其他数据库中
    - persist key 移除给定key的过期时间
    - randomkey 随机返回key空间的一个key
    - rename key new_key 重命名key
    - type key 返回值的类型

## 12 服务器相关命令
    - ping 测试连接是否存活
    - select db 选择数据库
    - quit 退出连接
    - dbsize 数据库key的数目
    - info 获取服务器的信息和统计
    - config get dir(* 获取所有) 获取服务器配置信息
    - flushdb 删除当前数据库中所有key
    - flushall 删除所有数据库中的所有key


## 13 Redis实用特性
