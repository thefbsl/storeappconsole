package payment;


public class Cash implements PaymentInterface{
    @Override
    public String pay(double finalCost) {
        return finalCost + "$ is paid by cash.";
    }
}
