package payment;

public class QR implements PaymentInterface{
    @Override
    public String pay(double finalCost) {
        return finalCost + "$ is paid by QR. Scan QR code";
    }
}
