package phone;
import card.Card;
import iterator.Iterator;
import iterator.List;
import phone.decorators.Case;
import phone.decorators.Charge;
import phone.decorators.ScreenProtector;
import phone.decorators.SimCard;
import phone.phoneCharacteristics.PhoneCharacteristics;


public class Iphone implements PhoneInterface, List {
    private String[] characteristics;

    public Iphone(){}

    public Iphone(String[] characteristics){
        this.characteristics = characteristics;
    }

    @Override
    public String getName() {
        return "Iphone 12";
    }
    @Override
    public double getCost() {
        return 2000;
    }

    @Override
    public Iterator getIterator() {
        return new characteristicsIt();
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
                PhoneInterface iphone = new Case(new Iphone());
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$"); //
                finalCost = iphone.getCost();
            }
            case 2 -> {
                PhoneInterface iphone = new Charge(new Iphone());
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 3 -> {
                PhoneInterface iphone = new ScreenProtector(new Iphone());
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 4 -> {
                PhoneInterface iphone = new SimCard(new Iphone());
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 5 -> {
                PhoneInterface iphone = new Case(new Charge(new Iphone()));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 6 -> {
                PhoneInterface iphone = new Case(new ScreenProtector(new Iphone()));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 7 -> {
                PhoneInterface iphone = new Case(new SimCard(new Iphone()));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 8 -> {
                PhoneInterface iphone = new Charge(new ScreenProtector(new Iphone()));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 9 -> {
                PhoneInterface iphone = new Charge(new SimCard(new Iphone()));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 10 -> {
                PhoneInterface iphone = new ScreenProtector(new SimCard(new Iphone()));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }case 11 -> {
                PhoneInterface iphone = new Case(new Charge(new ScreenProtector(new Iphone())));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 12 -> {
                PhoneInterface iphone = new Case(new Charge(new SimCard(new Iphone())));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 13 -> {
                PhoneInterface iphone = new Case(new ScreenProtector(new SimCard(new Iphone())));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 14 -> {
                PhoneInterface iphone = new Charge(new ScreenProtector(new SimCard(new Iphone())));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 15 -> {
                PhoneInterface iphone = new Case(new Charge(new ScreenProtector(new SimCard(new Iphone()))));
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }
            case 16 -> {
                PhoneInterface iphone = new Iphone();
                System.out.println(iphone.getName() + ". You have to pay " + iphone.getCost() + "$");
                finalCost = iphone.getCost();
            }


            default -> System.out.println("Wrong");
        }
        Iphone item = new Iphone();
        Card.myCard.add(item.getName());
        Iphone iphoneList = new Iphone(PhoneCharacteristics.IphoneFeatures);
        Iterator iterator = iphoneList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
