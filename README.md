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

三 log4j 相关

    配置appender
    配置root logger鱼appender关联
    配置其余日志的情况


    <appender name="ConsoleAppender" class="org.apache.log4j.ConsoleAppender">
        <!-- 设置日志输出的样式 -->
        <layout class="org.apache.log4j.PatternLayout">
            <!-- 设置日志输出的格式 -->
            <param name="ConversionPattern" value="%-4r [%t] %-5p %c %x - %m%n" />
        </layout>
        <!--过滤器设置输出的级别-->
        <filter class="org.apache.log4j.varia.LevelRangeFilter">
            <!-- 设置日志输出的最小级别 -->
            <param name="levelMin" value="DEBUG" />
            <!-- 设置日志输出的最大级别 -->
            <param name="levelMax" value="ERROR" />
            <!-- 设置日志输出的xxx，默认是false -->
            <param name="AcceptOnMatch" value="true" />
        </filter>
    </appender>

其中 <param name="ConversionPattern" value="%-4r [%t] %-5p %c %x - %m%n" />的
%-4r: -代表左对齐,不加-默认右对齐，4代表最小宽度，r代表输出自应用启动到输出该log信息耗费的毫秒数
                                 

HandlerMethodArgumentResolver:
使用时需要注意不要和spring mvc默认的解析器冲突，
即不要使用@RequestParam注解标记你想要解析的参数，与RequestParamMethodArgumentResolver冲突
且不要用Map类型作为你想要解析的参数的类型，与RequestParamMapMethodArgumentResolver冲突
详细spring 默认解析器见RequestMappingHandlerAdapter中的 getDefaultArgumentResolvers方法



