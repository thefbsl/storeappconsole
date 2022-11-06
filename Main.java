import card.Card;
import database.Database;
import delay.Delay;
import menu.MenuRealization;
import observer.Admin;
import observer.Sales;
import observer.User;
import payment.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Double> cost = new ArrayList<>();
        String[] sales = Sales.Sales;
        Connection con = Database.getConnection();
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        double max = 0;
        double currentCash = 0;
        boolean choice = true;
        double finalCost = 0;
        System.out.println("Enter your username:");

        String userName = sc.nextLine();
        User client = new User(userName);
        System.out.println("Hello " + userName + ". Welcome to our shop");

        while(choice) {
            MenuRealization.chooseItem(finalCost, cost);
            System.out.println("\nDo you want to choose something else:");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int chooseMore = sc.nextInt();
            if(chooseMore == 2) choice = false;
        }

        for (Double price: cost) {
            max += price;
        }
        System.out.println(max);
        System.out.println("\n----------------");
        try{
            String sql = "insert into users (username, cost) values ('" + userName + "' ," +  max + ")";
            Statement statement = con.createStatement();
            int rows = statement.executeUpdate(sql);
            if(rows > 0) System.out.println("new user was added to database");
            con.close();
        }catch (Exception ignored){}
        System.out.println("----------------");

        int n_items = Card.myCard.size();
        System.out.println("There are some sales for you");
        if(n_items <= 3){
            sales[0] = "1. Your item number is " + n_items + ". You can by at 15% discount";
        }else if(n_items > 3 && n_items <= 8){
            sales[0] = "1. Your item number is " + n_items + ". You can by at 20% discount";
        }else if(n_items > 8){
            sales[0] = "1. Your item number is" + n_items + ". You can by at 30% discount";
        }
        for(int i = 0; i < sales.length; i++){
            admin.addNewSale(sales[i]);
        }
        admin.follow(client);
        admin.addNewSale("4. No sale");
        System.out.println("Choose any of these sales");
        int chSale = sc.nextInt();

        switch (chSale) {
            case 1 -> {
                if(n_items <= 3){
                    max = max - max * 0.15;
                }else if(n_items > 3 && n_items <= 8){
                    max = max - max * 0.2;
                }else if(n_items > 8){
                    max = max - max * 0.3;
                }
            }
            case 2 -> {
                choice = true;
                while(choice) {
                    MenuRealization.chooseItem(finalCost, cost);
                    choice = false;
                }
                max = 0;
                for (Double price: cost) {
                    max += price;
                }
                max = max - max * 0.4;
            }
            case 3 -> {
                max = max - max * 0.05;
            }
            default -> System.out.println("Okay");
        }

        System.out.println("----------------");

        Delay.delay();

        System.out.println("Your card");
        for(int i = 0; i < n_items; i++){
            String temp = Card.myCard.get(i);
            System.out.println(temp);
        }
        System.out.println(max);
        System.out.println("----------------");

        System.out.println("Input your current cash in $");
        currentCash = sc.nextDouble();
        if(currentCash >= max){

            Payment.printPaymentMethods();
            int chPay = sc.nextInt();
            double price = PaymentRealization.choosePayment(chPay, max);
            double remain = currentCash - price;
            System.out.println(price +"$ was deducted. Balance is " + remain);
        }else System.out.println("Your current money is not enough");
    }
}