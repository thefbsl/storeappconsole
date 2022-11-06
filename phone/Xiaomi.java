package phone;

import card.Card;
import iterator.Iterator;
import iterator.List;
import phone.decorators.Case;
import phone.decorators.Charge;
import phone.decorators.ScreenProtector;
import phone.decorators.SimCard;
import phone.phoneCharacteristics.PhoneCharacteristics;

public class Xiaomi implements PhoneInterface, List {
    private String[] characteristics;
    public Xiaomi(){}

    public Xiaomi(String[] characteristics){
        this.characteristics = characteristics;
    }

    @Override
    public String getName() {
        return "Xiaomi Redmi 10";
    }

    @Override
    public double getCost() {
        return 1500;
    }

    @Override
    public Iterator getIterator() {
        return new Xiaomi.characteristicsIt();
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
        switch (chPhDec) {
            case 1 -> {
                PhoneInterface xioami = new Case(new Xiaomi());
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$"); //
                finalCost = xioami.getCost();
            }
            case 2 -> {
                PhoneInterface xioami = new Charge(new Xiaomi());
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 3 -> {
                PhoneInterface xioami = new ScreenProtector(new Xiaomi());
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 4 -> {
                PhoneInterface xioami = new SimCard(new Xiaomi());
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 5 -> {
                PhoneInterface xioami = new Case(new Charge(new Xiaomi()));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 6 -> {
                PhoneInterface xioami = new Case(new ScreenProtector(new Xiaomi()));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 7 -> {
                PhoneInterface xioami = new Case(new SimCard(new Xiaomi()));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 8 -> {
                PhoneInterface xioami = new Charge(new ScreenProtector(new Xiaomi()));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 9 -> {
                PhoneInterface xioami = new Charge(new SimCard(new Xiaomi()));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 10 -> {
                PhoneInterface xioami = new ScreenProtector(new SimCard(new Xiaomi()));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }case 11 -> {
                PhoneInterface xioami = new Case(new Charge(new ScreenProtector(new Xiaomi())));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 12 -> {
                PhoneInterface xioami = new Case(new Charge(new SimCard(new Xiaomi())));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 13 -> {
                PhoneInterface xioami = new Case(new ScreenProtector(new SimCard(new Xiaomi())));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 14 -> {
                PhoneInterface xioami = new Charge(new ScreenProtector(new SimCard(new Xiaomi())));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 15 -> {
                PhoneInterface xioami = new Case(new Charge(new ScreenProtector(new SimCard(new Xiaomi()))));
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }
            case 16 -> {
                PhoneInterface xioami = new Xiaomi();
                System.out.println(xioami.getName() + ". You have to pay " + xioami.getCost() + "$");
                finalCost = xioami.getCost();
            }


            default -> System.out.println("Wrong");
        }
        Xiaomi item = new Xiaomi();
        Card.myCard.add(item.getName());
        Xiaomi xiaomiList = new Xiaomi(PhoneCharacteristics.XiaomiFeatures);
        Iterator iterator = xiaomiList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
