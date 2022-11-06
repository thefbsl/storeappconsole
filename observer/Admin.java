package observer;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Subject{
    private List<Observer> followers = new ArrayList<>();
    private List<String> sales = new ArrayList<>();

    public void addNewSale(String sale){
        sales.add(sale);
        sendMessage();
    }
    @Override
    public void follow(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void sendMessage() {
        for(Observer observer: followers){
            observer.manageSales(sales);
        }
    }
}
