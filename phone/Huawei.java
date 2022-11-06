package phone;

import card.Card;
import iterator.Iterator;
import iterator.List;
import phone.decorators.Case;
import phone.decorators.Charge;
import phone.decorators.ScreenProtector;
import phone.decorators.SimCard;
import phone.phoneCharacteristics.PhoneCharacteristics;

public class Huawei implements PhoneInterface, List {
    private String[] characteristics;
    public Huawei(){}

    public Huawei(String[] characteristics){
        this.characteristics = characteristics;
    }
    @Override
    public String getName() {
        return "Huawei Plus 10";
    }

    @Override
    public double getCost() {
        return 1200;
    }

    @Override
    public Iterator getIterator() {
        return new Huawei.characteristicsIt();
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
                PhoneInterface huawei = new Case(new Huawei());
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$"); //
                finalCost = huawei.getCost();
            }
            case 2 -> {
                PhoneInterface huawei = new Charge(new Huawei());
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 3 -> {
                PhoneInterface huawei = new ScreenProtector(new Huawei());
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 4 -> {
                PhoneInterface huawei = new SimCard(new Huawei());
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 5 -> {
                PhoneInterface huawei = new Case(new Charge(new Huawei()));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 6 -> {
                PhoneInterface huawei = new Case(new ScreenProtector(new Huawei()));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 7 -> {
                PhoneInterface huawei = new Case(new SimCard(new Huawei()));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 8 -> {
                PhoneInterface huawei = new Charge(new ScreenProtector(new Huawei()));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 9 -> {
                PhoneInterface huawei = new Charge(new SimCard(new Huawei()));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 10 -> {
                PhoneInterface huawei = new ScreenProtector(new SimCard(new Huawei()));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }case 11 -> {
                PhoneInterface huawei = new Case(new Charge(new ScreenProtector(new Huawei())));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 12 -> {
                PhoneInterface huawei = new Case(new Charge(new SimCard(new Huawei())));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 13 -> {
                PhoneInterface huawei = new Case(new ScreenProtector(new SimCard(new Huawei())));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 14 -> {
                PhoneInterface huawei = new Charge(new ScreenProtector(new SimCard(new Huawei())));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 15 -> {
                PhoneInterface huawei = new Case(new Charge(new ScreenProtector(new SimCard(new Huawei()))));
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }
            case 16 -> {
                PhoneInterface huawei = new Huawei();
                System.out.println(huawei.getName() + ". You have to pay " + huawei.getCost() + "$");
                finalCost = huawei.getCost();
            }


            default -> {System.out.println("Wrong");}
        }
        Huawei item = new Huawei();
        Card.myCard.add(item.getName());
        Huawei huaweiList = new Huawei(PhoneCharacteristics.HuaweiFeatures);
        Iterator iterator = huaweiList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
