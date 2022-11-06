package phone.decorators;
import phone.Decorator;
import phone.PhoneInterface;

public class ScreenProtector extends Decorator {

    public ScreenProtector(PhoneInterface phoneInterface) {
        super(phoneInterface);
    }

    public String getName(){
        return phoneInterface.getName() + ", screen protector";
    };
    public double getCost(){
        return phoneInterface.getCost() + 20;
    }
}