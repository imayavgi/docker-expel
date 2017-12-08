package imaya.exper.producerapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
public class MessageSenderController {

    @Autowired
    private RequestTaker requester;

    @RequestMapping(value =  "/sendMsg", method= RequestMethod.GET)
    public void sendMsg(@RequestParam(value="msg") String msg) {
        requester.request(msg);
    }
}
