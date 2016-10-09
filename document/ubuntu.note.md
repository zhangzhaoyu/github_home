# Ubuntu Learning Note

## apt-get 详解
- apt-get update 更新本地软件包的索引（package index），本地软件包索引列出了软件仓库中所有可以安装的软件包及版本信息。
- apt-get dist-upgrade 在Debian 系统上升级系统版本，在Ubuntu 系统上，只升级Linux以及之前美柚被升级的软件包。
- apt-get do-release-upgrade Ubuntu 系统升级
- apt-get install --reinstall <pkg> 重新安装软件包
- apt-get install -f <pkg> 修复暗转
- sudo means swith user and do something
- apt-get install chrome -y 安装软件包， -y 表明安装时自动跳过询问。下载的软件包在目录/var/cache/apt/archives。
- apt-get upgrade 升级系统上可以升级的软件包。
- apt-get remove 删除系统上的软件包，并删除依赖于它的软件包。但是不能删除软件包的配置文件。
- apt-get remove --purge 删除软件包，并清理配置文件。
- apt-get purge 删除软件包及配置文件。
- apt-get clean 删除/var/cache/apt/archives 下的deb 安装包。
- apt-get autoclean 将已经删除了的软件的deb 包删除。
- apt-get source <pkg> 下载pkg 包的源码到当前目录
- apt-get download <pkg> 下载二进制包到当前目录
- apt-get source -d <pkg> 下载完源码后编译
- apt-get build-dep <pkg> 构建pkg 源码包的依赖环境
- apt-get autoremove 删除因安装软件自动安装的依赖，而先在不需要的依赖包

## apt-cache 介绍
- apt-cache stats 显示系统软件包的统计信息
- apt-cache search <pkg> 使用关键字pkg 搜索软件包
- apt-cache show <pkg_name> 显示软件包的详细信息
- apt-cache depends <pkg> 显示pkg 所以来的软件包
- apt-cache rdepends <pkg> 查看pkg 被哪些软件包所依赖

## 手动安装Deb 软件包
- dpkg -i wps-office*.deb 安装下载的deb 包。但是不能解决依赖关系。
- apt-get install gdebi 自动安装依赖包可以使用gdebi。
- gdebi <package.deb> 自动安装依赖
