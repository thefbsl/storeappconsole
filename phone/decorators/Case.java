package phone.decorators;
import phone.Decorator;
import phone.PhoneInterface;

public class Case extends Decorator {

    public Case(PhoneInterface phoneInterface) {
        super(phoneInterface);
    }

    public String getName(){
        return phoneInterface.getName() + ", case";
    };
    public double getCost(){
        return phoneInterface.getCost() + 50;
    }
}
