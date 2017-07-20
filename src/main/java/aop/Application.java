package aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config_aop.xml");
        VehicleService service = ctx.getBean("vehicleService", VehicleService.class);
        service.getCar().setName("");
        service.getCar().setModel("i10");
//        Car car=ctx.getBean("car",Car.class);
//        System.out.println("Car-------------------"+car);
    }

}
