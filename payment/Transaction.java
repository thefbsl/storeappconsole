package payment;

public class Transaction implements PaymentInterface{
    @Override
    public String pay(double finalCost) {
        return finalCost + "$ is paid by transaction. Send cash to this card number: 1658936554";
    }
}
