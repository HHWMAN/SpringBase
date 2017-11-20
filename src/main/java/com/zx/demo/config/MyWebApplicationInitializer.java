//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletRegistration;
//
//public class MyWebApplicationInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletCxt) {
//
//        // Load Spring web application configuration
//        AnnotationConfigWebApplicationContext cxt = new AnnotationConfigWebApplicationContext();
//        cxt.register(AppConfig.class);
//        cxt.refresh();
//
//        // Create DispatcherServlet
//        DispatcherServlet servlet = new DispatcherServlet(cxt);
//
//        // Register and map the Servlet
//        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/app");
//    }
//
//
//    @Override
//    public void onStartup(ServletContext container) {
//        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//        appContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");
//
//        ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(appContext));
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/");
//    }
//
//
//}
