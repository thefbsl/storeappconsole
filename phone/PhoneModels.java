package phone;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class PhoneModels {
    public static void printPhoneModels(){
        final HashMap<Integer, String> phoneModels = new HashMap<>();
        {
            phoneModels.put(1, "Iphone");
            phoneModels.put(2, "Samsung");
            phoneModels.put(3, "Xiaomi");
            phoneModels.put(4, "Huawei");
            phoneModels.put(5, "Oppo");
        }

        for( Map.Entry<Integer, String> entry : phoneModels.entrySet() ){
            System.out.println( entry.getKey() + ". " + entry.getValue() );
        }
    }

    public static void printPhoneDecorators(){
        final HashMap<Integer, String> phoneDecorators = new HashMap<>();
        {
            // case charge protector sim-card
            phoneDecorators.put(1, "Case");
            phoneDecorators.put(2, "Charge");
            phoneDecorators.put(3, "Screen protector");
            phoneDecorators.put(4, "SIM card");
            phoneDecorators.put(5, "Case and charge");
            phoneDecorators.put(6, "Case and screen protector");
            phoneDecorators.put(7, "Case and SIM card");
            phoneDecorators.put(8, "Charge and screen protector");
            phoneDecorators.put(9, "Charge and SIM card");
            phoneDecorators.put(10,"Screen protector and SIM card");
            phoneDecorators.put(11,"Case, charge and screen protector");
            phoneDecorators.put(12,"Case, charge and SIM card");
            phoneDecorators.put(13,"Case, screen protector and SIM card");
            phoneDecorators.put(14,"Charge, protector and SIM card ");
            phoneDecorators.put(15,"All of them");
            phoneDecorators.put(16,"Nothing");
        }

        for( Map.Entry<Integer, String> entry : phoneDecorators.entrySet() ){
            System.out.println( entry.getKey() + ". " + entry.getValue() );
        }
    }

    public static double choosePhoneModel(int chPh){
        double finalCost = 0;
        Scanner sc = new Scanner(System.in);
        switch (chPh) {
            case 1 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PhoneModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Iphone.checkDecorator(chPhDec);
            }
            case 2 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PhoneModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Samsung.checkDecorator(chPhDec);
            }
            case 3 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PhoneModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Xiaomi.checkDecorator(chPhDec);
            }
            case 4 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PhoneModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Huawei.checkDecorator(chPhDec);
            }
            case 5 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PhoneModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Oppo.checkDecorator(chPhDec);
            }
            default -> {
                System.out.println("wrong");
            }
        }
        return finalCost;
    }
}
