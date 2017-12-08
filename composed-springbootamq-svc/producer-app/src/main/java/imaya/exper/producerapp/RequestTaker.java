package imaya.exper.producerapp;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface RequestTaker {

    @Gateway(requestChannel = "requestChannel")
    public void request(String payload);

}
