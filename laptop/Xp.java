package laptop;

import card.Card;
import iterator.Iterator;
import iterator.List;
import laptop.decorators.LaptopCase;
import laptop.decorators.Mouse;
import laptop.decorators.Stand;
import laptop.laptopCharacteristics.LaptopCharacteristics;


public class Xp implements LaptopInterface, List {
    private String[] characteristics;
    public Xp(){}

    public Xp(String[] characteristics){this.characteristics = characteristics;}
    @Override
    public String getName() {
        return "Xp dell";
    }

    @Override
    public double getCost() {
        return 2200;
    }

    @Override
    public Iterator getIterator() {return new Xp.characteristicsIt();}
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
                LaptopInterface xp = new LaptopCase(new Xp());
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$"); //
                finalCost = xp.getCost();
            }
            case 2 -> {
                LaptopInterface xp = new Mouse(new Xp());
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$");
                finalCost = xp.getCost();
            }
            case 3 -> {
                LaptopInterface xp = new Stand(new Xp());
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$");
                finalCost = xp.getCost();
            }
            case 4 -> {
                LaptopInterface xp = new LaptopCase(new Mouse(new Xp()));
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$");
                finalCost = xp.getCost();
            }
            case 5 -> {
                LaptopInterface xp = new LaptopCase(new Stand(new Xp()));
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$");
                finalCost = xp.getCost();
            }
            case 6 -> {
                LaptopInterface xp = new Mouse(new Stand(new Xp()));
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$");
                finalCost = xp.getCost();
            }
            case 7 -> {
                LaptopInterface xp = new LaptopCase(new Mouse(new Stand(new Xp())));
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$");
                finalCost = xp.getCost();
            }
            case 8 -> {
                LaptopInterface xp = new Xp();
                System.out.println(xp.getName() + ". You have to pay " + xp.getCost() + "$");
                finalCost = xp.getCost();
            }

            default -> System.out.println("Wrong");
        }
        Xp item = new Xp();
        Card.myCard.add(item.getName());
        Xp itemList = new Xp(LaptopCharacteristics.LenovoFeatures);
        Iterator iterator = itemList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
