package laptop.decorators;
import laptop.LaptopDecorator;
import laptop.LaptopInterface;


public class Mouse extends LaptopDecorator {

    public Mouse(LaptopInterface laptopInterface) {
        super(laptopInterface);
    }

    public String getName(){
        return laptopInterface.getName() + ", mouse";
    };
    public double getCost(){
        return laptopInterface.getCost() + 110;
    }
}