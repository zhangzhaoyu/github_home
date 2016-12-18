# Elasticsearch Learning Note

##  集群健康
### 健康等级
Elasticsearch 集群中可以监控统计很多信息，集群的健康主要有三种状态：

- green 所有主要分片和复制分片都能使用
- yello 所有主要分片可用，但不是所有复制分片都可用
- red 不是所有的主要分片都可用

### 指令

- 查看健康 ： `GET /_cluster/health` 
- 查看所有节点 : `GET /_cat/nodes?v`
- 查看所有的索引 : `GET /_cat/indices?v`

## 索引操作
###创建索引 
```bash
	PUT /customer?pretty
```
Elasticsearch 默认的会为新建的索引创建`5` 个primary shards和`1` 个replica。当我们的集群中只有一个Node 时，无法创建副本，因此索引的状态为`yellow`。一旦新建的Node 加入集群，副本被分配到其他Node，索引的状态将会变回`green`。

### 创建文档
创建一个类型为info 的文档，并指定id 为1：
```bash
PUT /customer/info/1?pretty
{
	"name": "Zhaoyu Zhang"
}
```

返回结果为：
```
{
  "_index": "customer",
  "_type": "info",
  "_id": "1",
  "_version": 1,
  "result": "created",
  "_shards": {
    "total": 2,
    "successful": 1,
    "failed": 0
  },
  "created": true
}
```
Elasticsearch 不要求在创建文档之前必需先创建index 和 type。当创建文档时，不存在对应的index 和 type 时，Elasticsearch 会自动创建。

查询上面创建的文档：
```
GET /customer/info/1?pretty
```
返回结果为：

```bash
{
  "_index": "customer",
  "_type": "info",
  "_id": "1",
  "_version": 1,
  "found": true,
  "_source": {
    "name": "Zhaoyu Zhang"
  }
}
```
`found` 字段表明查询的结果状态，`_source` 字段返回之前创建的完整文档的JSON 描述。

### 删除索引
删除索引并显示索引列表：
```bash
DELETE /customer?pretty
GET /_cat/indices?pretty
```

结果为如下，表明成功删除：
```
{
  "acknowledged": true
}
```
从上面可以看出，Elasticsearch 的指令格式为：
```
<REST Verb> /<Index>/<Type>/<ID>
```

### 更新数据


