# SpringBase
my test of Spring 

//TODO
使用Mybatis 高级结果集重构查询(association、collection等)



一、上下文

<context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>
            /WEB-INF/application*.xml
        </param-value>
</context-param>
application*.xml:该上下文用来初始化ServletContext和SpringContext
Spring相关配置放在其中


<servlet>
    <servlet-name>dispatcher</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>WEB-INF/dispatcher-servlet.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
</servlet>
dispatcher-servlet.xml:DispatcherServlet对应的上下文，里面用到的视图解析器、
LocaleResolver、ThemeResolver等应该放入其中

两者关系:application*.xml是dispatcher-servlet.xml的父上下文，所以dispatcher-servlet.xml里面的东西对application*.xml不可见，而application*.xml里面的东西对dispatcher-servlet.xml可见

二、DelegatingFilterProxy作用
Spring用来代理filter的代理filter,未定义该类时，filter由容器创建托管，与spring毫无关系，加入该filter代理后，
便可以将web.xml中的filter去除，使用spring中定义bean的方式创建filter，DelegatingFilterProxy会自动将上下文中的filter加入自己内部，并调用执行









