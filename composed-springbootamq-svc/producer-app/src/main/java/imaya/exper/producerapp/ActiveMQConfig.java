package imaya.exper.producerapp;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class ActiveMQConfig {

    @Bean
    public Queue requestQueue() {
        return new ActiveMQQueue("request");
    }
}
