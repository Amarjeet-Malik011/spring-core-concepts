package dependency_injection.annotation_based;

import dependency_injection.services.EmailService;
import dependency_injection.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "dependency_injection.annotation_based")
public class DIConfiguration {

    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}
