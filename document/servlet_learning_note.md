# Servlet Learining Note

## Servlet 基础
   * Context-Param,Listener,Filter和Servlet 的启动顺序为前面所陈述的顺序。
   * 一个请求URI 组成由 requestURI = contextPath + servletPath + pathInfo。
   * web.xml 中<web-app> 中的meta-data-complete="true" 标注，则不会读取注解的配置。
   
## 请求与响应
   * RequestDispatcher 包括forward 和include 两个方法。
   * Cookie 可以设置HttpOnly，标注之后javascript 讲不能读取。
   * HttpSession 并非线程安全的，需注意属性共享存取的问题。
   * HttpServletResponse.encodeURL() 重写URL，添加session id 信息。

## Servlet 进阶
   * 对单个Servlet 实例进行进行配置需要@Override 无参的init()方法，而不是init(ServletConfig config) 方法。
   * Cookie 的值设为0，表明浏览器立刻删除Cookie。如果设为负值，表明关闭浏览器的时候删除。
   * ServletContext.getResourcePaths() 可以获取指定目录下的资源文件列表。"/"表示应用程序根目录。
   * ServletContext.getResourceAsStream() 读取文件内容。
   * 使用相对路径读取文件时，是相对于启动Web 容器启动时的命令执行目录。例如writer.println(new File("hello.txt").getAbsolutePath()) 输出为/home/zhaoyu/Java/tomcat/apache-tomcat-8.0.28/bin/hello.txt。
