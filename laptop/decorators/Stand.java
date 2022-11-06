package laptop.decorators;
import laptop.LaptopDecorator;
import laptop.LaptopInterface;


public class Stand extends LaptopDecorator {

    public Stand(LaptopInterface laptopInterface) {
        super(laptopInterface);
    }

    public String getName(){
        return laptopInterface.getName() + ", stand";
    };
    public double getCost(){
        return laptopInterface.getCost() + 60;
    }
}