package phone.decorators;
import phone.Decorator;
import phone.PhoneInterface;

public class SimCard extends Decorator {

    public SimCard(PhoneInterface phoneInterface) {
        super(phoneInterface);
    }

    public String getName(){
        return phoneInterface.getName() + ",  sim card";
    };
    public double getCost(){
        return phoneInterface.getCost() + 5;
    }
}