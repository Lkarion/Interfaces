package MailDeliveryService;

import java.util.Scanner;

public class Sender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How to send mail? Options: DHL, EMAIL, PIGEON");
        String service = sc.nextLine();
        try{
            MailDeliveryService mailService = getService(MailService.valueOf(service.toUpperCase()));
            send(mailService);
        }catch (IllegalArgumentException e){
            System.out.println("The MailService you've entered is not in ENUM");
        }
        sc.close();
    }

    public static void send(MailDeliveryService service){
            service.sendMail();
    }

    public static MailDeliveryService getService (MailService service){
        switch (service){
            case EMAIL: return new Email();
            case PIGEON: return new Pigeon();
            default: return new DHL();
        }
    }
}
