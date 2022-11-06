package laptop.decorators;
import laptop.LaptopDecorator;
import laptop.LaptopInterface;


public class LaptopCase extends LaptopDecorator {

    public LaptopCase(LaptopInterface laptopInterface) {
        super(laptopInterface);
    }

    public String getName(){
        return laptopInterface.getName() + ", laptop case";
    };
    public double getCost(){
        return laptopInterface.getCost() + 90;
    }
}
