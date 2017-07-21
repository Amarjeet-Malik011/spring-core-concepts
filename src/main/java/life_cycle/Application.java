package life_cycle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("config_lifeCycle.xml");
//        applicationContext.getBean("datasource",Datasource.class);
        applicationContext.registerShutdownHook();
    }
}
