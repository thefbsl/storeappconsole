package laptop;

import laptop.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LaptopModels {
    public static void printLaptopModels(){
        final HashMap<Integer, String> laptopModels = new HashMap<>();
        {
            laptopModels.put(1, "Mac");
            laptopModels.put(2, "Lenovo");
            laptopModels.put(3, "Asus");
            laptopModels.put(4, "Xp");
        }

        for( Map.Entry<Integer, String> entry : laptopModels.entrySet() ){
            System.out.println( entry.getKey() + ". " + entry.getValue() );
        }
    }

    public static void printLaptopDecorators(){
        final HashMap<Integer, String> laptopDecorators = new HashMap<>();
        {
            // case Mouse stand
            laptopDecorators.put(1, "Case");
            laptopDecorators.put(2, "Mouse");
            laptopDecorators.put(3, "Stand");
            laptopDecorators.put(4, "Case and mouse");
            laptopDecorators.put(5, "Case and stand");
            laptopDecorators.put(6, "Mouse and stand");
            laptopDecorators.put(7, "All of them");
            laptopDecorators.put(8, "Nothing");
        }

        for( Map.Entry<Integer, String> entry : laptopDecorators.entrySet() ){
            System.out.println( entry.getKey() + ". " + entry.getValue() );
        }
    }

    public static double chooseLaptopModel(int chPh){
        double finalCost = 0;
        Scanner sc = new Scanner(System.in);
        switch (chPh) {
            case 1 -> {
                System.out.println("Would you like to buy some adds for your laptop?");
                LaptopModels.printLaptopDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Mac.checkLaptopDecorator(chPhDec);
            }
            case 2 -> {
                System.out.println("Would you like to buy some adds for your laptop?");
                LaptopModels.printLaptopDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Lenovo.checkLaptopDecorator(chPhDec);

            }
            case 3 -> {
                System.out.println("Would you like to buy some adds for your laptop?");
                LaptopModels.printLaptopDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Asus.checkLaptopDecorator(chPhDec);
            }
            case 4 -> {
                System.out.println("Would you like to buy some adds for your laptop?");
                LaptopModels.printLaptopDecorators();
                int chPhDec = sc.nextInt();
                finalCost = Xp.checkLaptopDecorator(chPhDec);
            }
            default -> {
                System.out.println("wrong");
            }
        }
        return finalCost;
    }
}
