package laptop;

import card.Card;
import iterator.Iterator;
import iterator.List;
import laptop.decorators.LaptopCase;
import laptop.decorators.Mouse;
import laptop.decorators.Stand;
import laptop.laptopCharacteristics.LaptopCharacteristics;


public class Asus implements LaptopInterface, List {
    private String[] characteristics;
    public Asus(){}

    public Asus(String[] characteristics){this.characteristics = characteristics;}
    @Override
    public String getName() {
        return "Asus Tuf Gaming";
    }

    @Override
    public double getCost() {
        return 2100;
    }

    @Override
    public Iterator getIterator() {return new Asus.characteristicsIt();}
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
                LaptopInterface asus = new LaptopCase(new Asus());
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$"); //
                finalCost = asus.getCost();
            }
            case 2 -> {
                LaptopInterface asus = new Mouse(new Asus());
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$");
                finalCost = asus.getCost();
            }
            case 3 -> {
                LaptopInterface asus = new Stand(new Asus());
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$");
                finalCost = asus.getCost();
            }
            case 4 -> {
                LaptopInterface asus = new LaptopCase(new Mouse(new Asus()));
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$");
                finalCost = asus.getCost();
            }
            case 5 -> {
                LaptopInterface asus = new LaptopCase(new Stand(new Asus()));
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$");
                finalCost = asus.getCost();
            }
            case 6 -> {
                LaptopInterface asus = new Mouse(new Stand(new Asus()));
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$");
                finalCost = asus.getCost();
            }
            case 7 -> {
                LaptopInterface asus = new LaptopCase(new Mouse(new Stand(new Asus())));
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$");
                finalCost = asus.getCost();
            }
            case 8 -> {
                LaptopInterface asus = new Asus();
                System.out.println(asus.getName() + ". You have to pay " + asus.getCost() + "$");
                finalCost = asus.getCost();
            }

            default -> System.out.println("Wrong");
        }
        Asus item = new Asus();
        Card.myCard.add(item.getName());
        Asus itemList = new Asus(LaptopCharacteristics.LenovoFeatures);
        Iterator iterator = itemList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
