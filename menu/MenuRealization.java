package menu;
import java.util.ArrayList;
import java.util.Scanner;
import laptop.LaptopModels;
import pc.PCModels;
import phone.PhoneModels;
import tv.TVModels;
import watch.WatchModels;

public class MenuRealization {
    public static void chooseItem(double finalCost, ArrayList<Double> cost){
        Scanner sc = new Scanner(System.in);
        MainMenu.printCategories();
        MainMenu.intro();
        int ch = sc.nextInt();
        switch (ch) {
            case 1 -> {
                PhoneModels.printPhoneModels();
                System.out.println("Choose model:");
                int chPh = sc.nextInt();
                finalCost = PhoneModels.choosePhoneModel(chPh);
            }
            case 2 -> {
                LaptopModels.printLaptopModels();
                System.out.println("Choose model:");
                int chPh = sc.nextInt();
                finalCost = LaptopModels.chooseLaptopModel(chPh);
            }
            case 3 -> {
                PCModels.printPCModels();
                System.out.println("Choose model:");
                int chPh = sc.nextInt();
                PCModels.choosePCModel(chPh);
            }
            case 4 -> {
                WatchModels.printWatchModels();
                System.out.println("Choose model:");
                int chPh = sc.nextInt();
                WatchModels.chooseWatchModel(chPh);
            }
            case 5 -> {
                TVModels.printTVModels();
                System.out.println("Choose model:");
                int chPh = sc.nextInt();
                TVModels.chooseTVModel(chPh);
            }
            default -> System.out.println("wrong");
        }
        cost.add(finalCost);
    }
}
