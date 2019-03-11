package basicExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class basicExampleMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Tea tea=context.getBean("tea",Tea.class);
        Tea tea2=context.getBean("tea",Tea.class);
        if(tea.equals(tea2))
            System.out.println("true");
        else 
            System.out.println("false");
            
            
        System.out.println(tea);
        

    }
}
