package phone;

import card.Card;
import iterator.Iterator;
import iterator.List;
import phone.decorators.Case;
import phone.decorators.Charge;
import phone.decorators.ScreenProtector;
import phone.decorators.SimCard;
import phone.phoneCharacteristics.PhoneCharacteristics;

public class Samsung implements PhoneInterface, List {

    private String[] characteristics;
    public Samsung(){}

    public Samsung(String[] characteristics){
        this.characteristics = characteristics;
    }

    @Override
    public String getName() {
        return "Samsung s18";
    }

    @Override
    public double getCost() {
        return 1800;
    }

    @Override
    public Iterator getIterator() {
        return new Samsung.characteristicsIt();
    }

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

    public static double checkDecorator(int chPhDec){
        double finalCost = 0;
        Samsung item = new Samsung();
        Card.myCard.add(item.getName());
        switch (chPhDec) {
            case 1 -> {
                PhoneInterface samsung = new Case(new Samsung());
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$"); //
                finalCost = samsung.getCost();
            }
            case 2 -> {
                PhoneInterface samsung = new Charge(new Samsung());
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 3 -> {
                PhoneInterface samsung = new ScreenProtector(new Samsung());
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 4 -> {
                PhoneInterface samsung = new SimCard(new Samsung());
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 5 -> {
                PhoneInterface samsung = new Case(new Charge(new Samsung()));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 6 -> {
                PhoneInterface samsung = new Case(new ScreenProtector(new Samsung()));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 7 -> {
                PhoneInterface samsung = new Case(new SimCard(new Samsung()));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 8 -> {
                PhoneInterface samsung = new Charge(new ScreenProtector(new Samsung()));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 9 -> {
                PhoneInterface samsung = new Charge(new SimCard(new Samsung()));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 10 -> {
                PhoneInterface samsung = new ScreenProtector(new SimCard(new Samsung()));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }case 11 -> {
                PhoneInterface samsung = new Case(new Charge(new ScreenProtector(new Samsung())));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 12 -> {
                PhoneInterface samsung = new Case(new Charge(new SimCard(new Samsung())));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 13 -> {
                PhoneInterface samsung = new Case(new ScreenProtector(new SimCard(new Samsung())));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 14 -> {
                PhoneInterface samsung = new Charge(new ScreenProtector(new SimCard(new Samsung())));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 15 -> {
                PhoneInterface samsung = new Case(new Charge(new ScreenProtector(new SimCard(new Samsung()))));
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }
            case 16 -> {
                PhoneInterface samsung = new Samsung();
                System.out.println(samsung.getName() + ". You have to pay " + samsung.getCost() + "$");
                finalCost = samsung.getCost();
            }


            default -> System.out.println("Wrong");
        }

        Samsung samsungList = new Samsung(PhoneCharacteristics.SamsungFeatures);
        Iterator iterator = samsungList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
