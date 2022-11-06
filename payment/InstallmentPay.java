package payment;

public class InstallmentPay implements PaymentInterface{
    public static void printPeriod(){
        int j = 1;
        System.out.println("Choose period of time:");
        for(int i = 3; i < 25; i *= 2){
            System.out.println(j + ". " + i + " months");
            j++;
        }
    }
    @Override
    public String pay(double finalCost) {
        return "You should pay " + finalCost + "$ for month";
    }
}
