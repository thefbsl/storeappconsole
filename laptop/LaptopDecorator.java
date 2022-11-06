package laptop;

import phone.PhoneInterface;

public abstract class LaptopDecorator implements LaptopInterface {
    protected LaptopInterface laptopInterface;
    public LaptopDecorator(LaptopInterface laptopInterface){
        this.laptopInterface = laptopInterface;
    }

    public String getName(){
        return laptopInterface.getName();
    };
    public double getCost(){
        return laptopInterface.getCost();
    }

}