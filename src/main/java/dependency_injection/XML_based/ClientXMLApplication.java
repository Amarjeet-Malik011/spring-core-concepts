package dependency_injection.XML_based;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientXMLApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "config_di.xml");
        MyXMLApplication app = context.getBean(MyXMLApplication.class);

        app.processMessage("Hi kavita xml based", "kavita9211@gmail.com");

        // close the context
        context.close();
    }

}
