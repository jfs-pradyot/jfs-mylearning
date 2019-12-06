https://howtodoinjava.com/spring5/webmvc/spring-dispatcherservlet-tutorial/

#   Dispatcher Servlet

##   How it takes care of applicationContext file
takes care of the applicationContext and manages the bean configuration.
where it performs dependency injection and other stuffs.

###   DispatcherServlet performs
    1. All the tasks that ApplicationContext does in the Spring Core.
        i.e bean definitions, bean wiring, IOC by dependency injection
        Method to perform
        1. Traditional Method: define an xml file like did in spring core,
                                perform everything and tell the DispatcherServlet its location.[in web.xml by  specifying init-param]
            [No need to define a dispatcher-servlet.xml file if following this method, can perform all the operations of dispatcher-servlet in it.]

        2. Common Method: No need of extra xml file, just define everything in                      DispatcherServlet.xml itself

    2. Acts as the front controller, to handle all the requests and manage all the controllers. and resolves the view and returns it.   
        Method to perform
        Similar to above approach

Steps:
1. Define the spring-config file.[ex: spring-bean-configuration.xml]
    and perform all the operations
2. In the dispatcher servlet declaration in web.xml
    define an init param which defines the location of the spring-bean-config.xml 
    location
    
    <servlet>
    <servlet-name></servlet-name>
    <servlet-class></servlet-class>
    <init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/spring-beans-configuration.xml</param-value>
    </servlet>

    


What are the different types of events of Listeners?

#   Following are the different types of events of listeners:

ContextClosedEvent – This event is called when the context is closed.
ContextRefreshedEvent – This event is called when context is initialized or refreshed
RequestHandledEvent – This event is called when the web context handles request

#   