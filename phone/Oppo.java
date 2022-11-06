package phone;
import card.Card;
import iterator.List;
import iterator.Iterator;
import phone.decorators.Case;
import phone.decorators.Charge;
import phone.decorators.ScreenProtector;
import phone.decorators.SimCard;
import phone.phoneCharacteristics.PhoneCharacteristics;

public class Oppo implements PhoneInterface, List {
    private String[] characteristics;
    public Oppo(){}

    public Oppo(String[] characteristics){
        this.characteristics = characteristics;
    }

    @Override
    public String getName() {
        return "Oppo 21";
    }

    @Override
    public double getCost() {
        return 1000;
    }

    @Override
    public Iterator getIterator() {
        return new Oppo.characteristicsIt();
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
                PhoneInterface oppo = new Case(new Oppo());
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$"); //
                finalCost = oppo.getCost();
            }
            case 2 -> {
                PhoneInterface oppo = new Charge(new Oppo());
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 3 -> {
                PhoneInterface oppo = new ScreenProtector(new Oppo());
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 4 -> {
                PhoneInterface oppo = new SimCard(new Oppo());
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 5 -> {
                PhoneInterface oppo = new Case(new Charge(new Oppo()));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 6 -> {
                PhoneInterface oppo = new Case(new ScreenProtector(new Oppo()));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 7 -> {
                PhoneInterface oppo = new Case(new SimCard(new Oppo()));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 8 -> {
                PhoneInterface oppo = new Charge(new ScreenProtector(new Oppo()));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 9 -> {
                PhoneInterface oppo = new Charge(new SimCard(new Oppo()));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 10 -> {
                PhoneInterface oppo = new ScreenProtector(new SimCard(new Oppo()));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }case 11 -> {
                PhoneInterface oppo = new Case(new Charge(new ScreenProtector(new Oppo())));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 12 -> {
                PhoneInterface oppo = new Case(new Charge(new SimCard(new Oppo())));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 13 -> {
                PhoneInterface oppo = new Case(new ScreenProtector(new SimCard(new Oppo())));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 14 -> {
                PhoneInterface oppo = new Charge(new ScreenProtector(new SimCard(new Oppo())));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 15 -> {
                PhoneInterface oppo = new Case(new Charge(new ScreenProtector(new SimCard(new Oppo()))));
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }
            case 16 -> {
                PhoneInterface oppo = new Oppo();
                System.out.println(oppo.getName() + ". You have to pay " + oppo.getCost() + "$");
                finalCost = oppo.getCost();
            }

            default -> System.out.println("Wrong");
        }
        Oppo item = new Oppo();
        Card.myCard.add(item.getName());
        Oppo oppoList = new Oppo(PhoneCharacteristics.OppoFeatures);
        Iterator iterator = oppoList.getIterator();
        System.out.println("Characteristics:");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
        return finalCost;
    }
}
