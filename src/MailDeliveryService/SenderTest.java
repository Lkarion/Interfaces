package MailDeliveryService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SenderTest {

    @Test
    void test_send_Normal(){
        MailDeliveryService service = new DHL();
        assertInstanceOf(Email.class, Sender.getService(MailService.EMAIL));
    }

}