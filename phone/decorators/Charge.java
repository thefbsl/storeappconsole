package phone.decorators;

import phone.Decorator;
import phone.PhoneInterface;

public class Charge extends Decorator {
        public Charge(PhoneInterface phoneInterface) {
            super(phoneInterface);
        }

        public String getName(){
            return phoneInterface.getName() + ", charge";
        };
        public double getCost(){
            return phoneInterface.getCost() + 70;
        }
}