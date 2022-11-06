package tv;

import phone.*;

import java.util.Scanner;

public class TVModels {
    public static void printTVModels(){

    }

    public static void printPhoneDecorators(){

    }

    public static void chooseTVModel(int chPh){
        Scanner sc = new Scanner(System.in);
        switch (chPh) {
            case 1 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                TVModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Iphone.checkDecorator(chPhDec);
            }
            case 2 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                TVModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Samsung.checkDecorator(chPhDec);
            }
            case 3 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                TVModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Xiaomi.checkDecorator(chPhDec);
            }
            case 4 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                TVModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Huawei.checkDecorator(chPhDec);
            }
            case 5 -> {
                System.out.println("Would you like to buy some adds for your phone?");
                TVModels.printPhoneDecorators();
                int chPhDec = sc.nextInt();
                Oppo.checkDecorator(chPhDec);
            }
            default -> {
                System.out.println("wrong");
            }
        }
    }
}
