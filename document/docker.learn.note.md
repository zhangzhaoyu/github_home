# Docker Learning Note
## 命令
- sudo docker run -i -t ubuntu /bin/bash 
  `-i` 保证容器中的STDIN 是开启的；`-t` 为创建的容器分配一个伪tty 终端。
  `--restart` 自动重启容器，可选参数为always,on-failure [n] 设置重启次数。
  
- sudo docker attach [containerId|name] 
  附着到一个正在运行的容器上，退出时容器也停止

- sudo docker logs -f [id|name] 
  查看容器的运行状态，`-f` 参数为跟踪守护式日志监控 `-t` 添加时间戳。 `--log-driver` 更改日志的驱动，例如默认的json-file 或 syslog。
  
- sudo docker top [id|name]
  查看容器内的进行
  
- sudo docker stats
  用来显示一个或多个容器的统计信息
  
- sudo docker exec
  在容器内部额外启动新进程。
  
- sudo docker stop [id|name]
  停止正在运行的容器。
  
- sudo docker kill [id|name]
  快速停止容器
  
- sudo docker inspect
  获取更多的容器信息
  
- sudo docker rm 
  删除容器
  
- sudo docker rm `sudo docker ps -a -q`
  一次删除所有容器
  
- sudo docker search 
  查找Docker Hub 上公共的可用镜像。
  
## 创建镜像
- sudo docker commit
  通常不建议采用docker commit 创建新的镜像，而使用Dockerfile 和 docker build
  
- sudo docker build -t="zhaoyu/nginx_web:v1.0.0" ./
  创建镜像
  
- sudo docker history [id]
  查看镜像的创建过程
  
- sudo docker port [id|name] [port]
  查看容器的端口映射
  
- 容器端口映射
  `-p 8080:80` 或 `-p 127.0.0.1:8080:80` 或 `-p 127.0.0.1::80`
  `-P` 对外公开再Dockerfile 中通过EXPOSE 指令公开的所有端口

## Dockerfile 命令
- CMD ["/bin/bash"] 
  指定容器启动时要执行的命令，可以被run 指定的指令覆盖
  
- ENTRYPOINT 
  与CMD 类似，但是不会被run 指定的指令覆盖
  
- WORKDIR
  从镜像创建容器时，在容器中创建一个工作目录。可以通过-w 命令再运行时覆盖工作目录
  
- ENV
  用来在镜像构建的过程中设置环境变量。
  
- USER
  用来指定该镜像将以什么样的用户去运行。如果不通过USER 指定用户，将默认用户为root。

- VOLUME 
  用来向基于镜像创建的容器添加卷。一个卷是可以存在与一个或者多个容器内的特定目录，这个目录可以绕过联合文件系统。
  VOLUME ["/opt/project"] 该指令将为基于此镜像创建的任何容器创建一个名为`opt/project` 的挂载点。
  
- ADD
  用来将构建环境下的文件和目录复制到镜像中。目标文件可以是目录，文件或者链接。ADD 在处理源文件为压缩文件时，会自动解压缩。等价与`tar -x`。
  如果目的地址已经存在对应的文件，则默认不会替换。
  
- COPY
  类似ADD，但是不会解压缩归档文件。文件源路径必须是一个与当前构建环境相对的文件或者目录。任何位于构建目录之外的文件都不可用。
  
- LABEL
  用于为Docker 镜像添加元数据。元数据以键值对的形式展现。
  LABEL version="1.0"
 
- STOPSIGNAL
  用来设置挺尸容器时发送什么系统调用信号给容器。
  
- ARG
  用来指定docker build 命令运行时传递给构建运行时的变量。在构建时需要加上--build-arg 标志。用户只能在构建时指定在Dockerfile 需要传递的参数。
  Docker 预定义了一组ARG 变量。可以在构建时直接使用。
  
- ONBUILD
  为镜像添加触发器。只能在子镜像中触发，不能在孙子镜像中触发。
  
- 
