package phone;

public abstract class Decorator implements PhoneInterface {
    protected PhoneInterface phoneInterface;
    public Decorator(PhoneInterface phoneInterface){
        this.phoneInterface = phoneInterface;
    }

    public String getName(){
        return phoneInterface.getName();
    };
    public double getCost(){
        return phoneInterface.getCost();
    }

}
