package payment;
import java.util.Scanner;

public class PaymentRealization {
    public static double choosePayment(int chPay, double finalCost){
        Scanner sc = new Scanner(System.in);
        switch (chPay) {
            case 1 -> {
                Payment bankCard = new Payment(new BankCard());
                System.out.println(bankCard.payForItem(finalCost));
            }
            case 2 -> {
                Payment transaction = new Payment(new Transaction());
                System.out.println(transaction.payForItem(finalCost));
            }
            case 3 -> {
                Payment qr = new Payment(new QR());
                System.out.println(qr.payForItem(finalCost));
            }
            case 4 -> {
                Payment cash = new Payment(new Cash());
                System.out.println(cash.payForItem(finalCost));
            }
            case 5 -> {
                InstallmentPay.printPeriod();
                int chPeriod = sc.nextInt();
                switch (chPeriod){
                    case 1 -> {
                        finalCost /= 3;
                        finalCost = Math.round(finalCost * 100.0) / 100;
                        Payment instPay = new Payment(new InstallmentPay());
                        System.out.println(instPay.payForItem(finalCost));
                    }
                    case 2 -> {
                        finalCost /= 6;
                        finalCost = Math.round(finalCost * 100.0) / 100;
                        Payment instPay = new Payment(new InstallmentPay());
                        System.out.println(instPay.payForItem(finalCost));
                    }
                    case 3 -> {
                        finalCost /= 12;
                        finalCost = Math.round(finalCost * 100.0) / 100;
                        Payment instPay = new Payment(new InstallmentPay());
                        System.out.println(instPay.payForItem(finalCost));
                    }
                    case 4 -> {
                        finalCost /= 24;
                        finalCost = Math.round(finalCost * 100.0) / 100;
                        Payment instPay = new Payment(new InstallmentPay());
                        System.out.println(instPay.payForItem(finalCost));
                    }
                    default -> System.out.println("wrong");
                }
            }
            default -> System.out.println("wrong");
        }
        return finalCost;
    }
}
