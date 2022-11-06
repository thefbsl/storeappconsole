package payment;

public class BankCard implements PaymentInterface{
    @Override
    public String pay(double finalCost) {
        return finalCost + "$ is paid by card. Put your card here";
    }
}
