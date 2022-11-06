package payment;

import java.util.HashMap;
import java.util.Map;

public class Payment {
    public static void printPaymentMethods(){
        System.out.println("Choose payment method: ");
        final HashMap<Integer, String> paymentMethods = new HashMap<>();
        {
            paymentMethods.put(1, "Bank card");
            paymentMethods.put(2, "Transaction");
            paymentMethods.put(3, "QR");
            paymentMethods.put(4, "Cash");
            paymentMethods.put(5, "Installment pay");
        }

        for( Map.Entry<Integer, String> entry : paymentMethods.entrySet() ){
            System.out.println( entry.getKey() + ". " + entry.getValue() );
        }
    }
    private final PaymentInterface paymentInterface;
    public Payment(PaymentInterface paymentInterface){
        this.paymentInterface = paymentInterface;
    }

    public String payForItem(double finalCost){
        return paymentInterface.pay(finalCost);
    }
}
