package laptop;

import card.Card;
import iterator.Iterator;
import iterator.List;
import laptop.decorators.LaptopCase;
import laptop.decorators.Mouse;
import laptop.decorators.Stand;
import laptop.laptopCharacteristics.LaptopCharacteristics;


public class Lenovo implements LaptopInterface, List{
    private String[] characteristics;
    public Lenovo(){}

    public Lenovo(String[] characteristics){this.characteristics = characteristics;}
    @Override
    public String getName() {
        return "Lenovo Legion";
    }

    @Override
    public double getCost() {
        return 2300;
    }

    @Override
    public Iterator getIterator() {return new characteristicsIt();}


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
                LaptopInterface lenovo = new LaptopCase(new Lenovo());
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$"); //
                finalCost = lenovo.getCost();
            }
            case 2 -> {
                LaptopInterface lenovo = new Mouse(new Lenovo());
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$");
                finalCost = lenovo.getCost();
            }
            case 3 -> {
                LaptopInterface lenovo = new Stand(new Lenovo());
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$");
                finalCost = lenovo.getCost();
            }
            case 4 -> {
                LaptopInterface lenovo = new LaptopCase(new Mouse(new Lenovo()));
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$");
                finalCost = lenovo.getCost();
            }
            case 5 -> {
                LaptopInterface lenovo = new LaptopCase(new Stand(new Lenovo()));
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$");
                finalCost = lenovo.getCost();
            }
            case 6 -> {
                LaptopInterface lenovo = new Mouse(new Stand(new Lenovo()));
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$");
                finalCost = lenovo.getCost();
            }
            case 7 -> {
                LaptopInterface lenovo = new LaptopCase(new Mouse(new Stand(new Lenovo())));
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$");
                finalCost = lenovo.getCost();
            }
            case 8 -> {
                LaptopInterface lenovo = new Lenovo();
                System.out.println(lenovo.getName() + ". You have to pay " + lenovo.getCost() + "$");
                finalCost = lenovo.getCost();
            }

            default -> System.out.println("Wrong");
        }
        Lenovo item = new Lenovo();
        Card.myCard.add(item.getName());
        Lenovo itemList = new Lenovo(LaptopCharacteristics.LenovoFeatures);
        Iterator iterator = itemList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
