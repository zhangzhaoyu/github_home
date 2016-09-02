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

## 事件，监听器，过滤器
   * HttpSessionBindingListener 可以实现将实现该接口的对象加入session 中时，触发该接口定义的方法。当session 失效时，会触发valueUnBound() 方法。
   * Dispatcher 可以用来设置Filter 被触发的条件。默认的为REQUEST。在枚举类DispatcherType 中说明。

## Servlet 异步处理
   * Servlet 支持异步处理需要标注asyncSupported 属性。如果异步处理的Servlet 的前端有Filter，则Filter 也需要标注异步支持属性。
   * 同一个AsyncContext 上不可同时调用complete() 和forward() 方法，否则会报错。也不可以在两个异步Servlet 之间派送。
   * 如果对异步的过程进行监控，可以实现AsyncListener 接口。

## JSP
   * include 与jsp:include，前者会先包含然后转译为一个Servlet，后者包含与被包含的JSP页面都会生成Servlet。
   * 注意区分<%%>,<%!%>和<%=%>。第一个的内容会被转转译为类的内容，第二个会被转译为service() 方法中的内容。
   * JSP 中的隐式对象包括out(JspWriter->PrintWriter),request,response,config(ServletConfig),application(ServletContext),session,pageContext, exception和page(this)。
   * JSP 中的隐式对象只能在<%!%>和<%=%>中使用。
   * pageContext 封装了页面的所有信息，可以使用pageContext 设置共享属性，并设置范围。pageContext.findAttribute() 将从page,request,session 和application 依次查找属性。
   
