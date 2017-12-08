package imaya.exper.producerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@ImportResource("classpath*:/spring-int-context.xml")
public class ProducerAppApplication {



    public static void main(String[] args) {

        SpringApplication.run(ProducerAppApplication.class, args);

    }
}
