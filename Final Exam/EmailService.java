public interface NotificationSender
{
    // public void confirmOrder() {}
    public void sendOrderNotification(Order order, String message) {}
}

public class EmailService {
    private final String senderEmail = "sender@example.com";

    public sendOrderNotification(Order order, String message)
    {
        this.senderEmail(order.getCustomerEmail, message);
    }
    
    public void sendEmail(String recipient, String message) {
        // Logic to send email using the senderEmail field
        System.out.println("Sending email from " + senderEmail + " to " + recipient + ": " + 
        message);
    }
}

public class SMSService {

    public sendOrderNotification(Order order, String message)
    {
        this.sendersms(order.getCustomerSMSNumber, message);
    }
    
    public void sendersms(String recipient, String message) {
        //Some implementation of how to send notification through SMS
    }
}

public class CallService {
    public sendOrderNotification(Order order, String message)
    {
        this.senderCall(order.getCustomerPhoneNumber, message);
    }
    
    public void senderCall(String recipient, String message) {
        //Some implementation of how to send notification through phone call somehow
    }
}


public class OrderService {
    
    public void confirmOrder(Order order, NotificationSender notificationSenderService) {
        notificationSenderService.sendNotification(order, "Your order has been confirmed!");
    }
}




// NOTE: How interpreted this was that what if we also want to Introduce
// ways of confirming order on other things other than email such as SMS
// or maybe even automated phone call (don't know how that would be
// programmed though). So if we wanted that then we would have to make
// seperate methods for each of them like this in the OrderService which
// would violate DIP:
// public OrderService{
//     emailService = EmailService()
//     smsService = SMSService()
//     callService = CallService()

//     confirmOrderwithEmail(){
//         emailService.sendEmail........
//     }

//     confirmOrderwithSMS(){
//         emailService.sendSMS.......
//     }

//     confirmOrderwithCall() {
//         emailService.sendcall..........Email
//     }
// }

// So we made an interface sending notifications of
// order cofnirmation with a method with the receipent's details which
// could be an email or phone number, as well as a message. And then I
// separated all the services (Email, SMS and call) and made them implement it.
// So now when confirming an order, all I need to do is just take whichever service we are using,
// Give it the order and the service, and then on each it will just call the sendNotification
// method and whatever unique implementation of that method every service has, it will do it.
// Please also note that I assumed order would have different contact method
// details associated with it instead of a singular one so (i.e. this was necessary as opposed to
// having a "recipient" variable in the Order class which i could again generalize), so that is why
// I sent it as an argument in each sendNotification method.
