# Ubuntu Nginx Install

## install pcre
   * sudo apt-get install libpcre3 libpcre3-dev

## install zlib
   * sudo apt-get install zlib1g-dev

## install openssl
   * sudo apt-get install openssl

## install nginx
   * tar -zxvf nginx-1.10.1.tar.gz
   * ./configure 检查必备条件
   * make && install

## commands
   * cd /usr/local/nginx/sbin
   * ./nginx 启动
   * ./nginx -s reload 重启
   * ./nginx -s stop 快速停止
   * ./nginx -s quit 正常停止
   * ./nginx -t 判断配置文件争取与否
   * sudo kill -QUIT 主进程号 从容停止
   * sudo kill -TERM 主进程号 快速停止
   * sudo kill -9 主进程号 强制停止
