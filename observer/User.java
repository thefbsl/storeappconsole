package observer;

import observer.Observer;

import java.util.List;

public class User implements Observer {
    public String userName;
    public User(String username){
        this.userName = username;
    }

    @Override
    public void manageSales(List<String> sales) {
        System.out.println(userName + "\n -*- Sales for you -*-");
        for(String sale: sales){
            System.out.println(sale);
        }
    }
}





