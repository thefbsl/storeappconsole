package pc;

import phone.*;

import java.util.Scanner;

public class PCModels {
    public static void printPCModels(){

    }

    public static void printPhoneDecorators(){

    }

    public static void choosePCModel(int chPh){
        Scanner sc = new Scanner(System.in);
        switch (chPh) {
            case 1 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PCModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Iphone.checkDecorator(chPhDec);
            }
            case 2 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PCModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Samsung.checkDecorator(chPhDec);
            }
            case 3 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PCModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Xiaomi.checkDecorator(chPhDec);
            }
            case 4 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PCModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Huawei.checkDecorator(chPhDec);
            }
            case 5 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                PCModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Oppo.checkDecorator(chPhDec);
            }
            default -> {
                System.out.println("wrong");
            }
        }
    }
}
