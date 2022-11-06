package laptop;

import card.Card;
import iterator.Iterator;
import iterator.List;
import laptop.decorators.LaptopCase;
import laptop.decorators.Mouse;
import laptop.decorators.Stand;
import laptop.laptopCharacteristics.LaptopCharacteristics;


public class Mac implements LaptopInterface, List {
    private String[] characteristics;
    public Mac(){}

    public Mac(String[] characteristics){this.characteristics = characteristics;}
    @Override
    public String getName() {
        return "MacBook Pro";
    }

    @Override
    public double getCost() {
        return 2500;
    }

    @Override
    public Iterator getIterator() {return new Mac.characteristicsIt();}
    private class characteristicsIt implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            return i < characteristics.length;
        }

        @Override
        public Object next() {
            return characteristics[i++];
        }
    }

    public static double checkLaptopDecorator(int chLPDec) {
        double finalCost = 0;
        switch (chLPDec) {
            case 1 -> {
                LaptopInterface mac = new LaptopCase(new Mac());
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$"); //
                finalCost = mac.getCost();
            }
            case 2 -> {
                LaptopInterface mac = new Mouse(new Mac());
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$");
                finalCost = mac.getCost();
            }
            case 3 -> {
                LaptopInterface mac = new Stand(new Mac());
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$");
                finalCost = mac.getCost();
            }
            case 4 -> {
                LaptopInterface mac = new LaptopCase(new Mouse(new Mac()));
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$");
                finalCost = mac.getCost();
            }
            case 5 -> {
                LaptopInterface mac = new LaptopCase(new Stand(new Mac()));
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$");
                finalCost = mac.getCost();
            }
            case 6 -> {
                LaptopInterface mac = new Mouse(new Stand(new Mac()));
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$");
                finalCost = mac.getCost();
            }
            case 7 -> {
                LaptopInterface mac = new LaptopCase(new Mouse(new Stand(new Mac())));
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$");
                finalCost = mac.getCost();
            }
            case 8 -> {
                LaptopInterface mac = new Mac();
                System.out.println(mac.getName() + ". You have to pay " + mac.getCost() + "$");
                finalCost = mac.getCost();
            }

            default -> System.out.println("Wrong");
        }
        Mac item = new Mac();
        Card.myCard.add(item.getName());
        Mac itemList = new Mac(LaptopCharacteristics.LenovoFeatures);
        Iterator iterator = itemList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
