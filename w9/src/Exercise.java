import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Item item1 = new Item("soup", 5.1);
        Item item2 = new Item("noodle", 2.3);
        Item item3 = new Item("pizza", 13.6);

        Booking booking = new Booking();
        booking.addItem(item1);
        booking.addItem(item2);
        booking.addItem(item3);
        System.out.println(booking.bookingSum());

        Booking westernbooking = new WesternBooking();
        westernbooking.addItem(item1);
        westernbooking.addItem(item2);
        westernbooking.addItem(item3);
        westernbooking.addDiscount(new VoucherDiscount("Test", 4.15));
        System.out.println(westernbooking.bookingSum());

        Booking otherbooking = new OtherBooking();
        otherbooking.addItem(item1);
        otherbooking.addItem(item2);
        otherbooking.addItem(item3);
        otherbooking.addDiscount(new PercentOffDiscount("Test", 50));
        System.out.println(otherbooking.bookingSum());
    }
}

class Item {
    private String name;
    private double price;

    public Item(){}

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return String.format("Name: %s - Price: %.2f", name, price);
    }
}

class Booking {
    private ArrayList<Item> itemList;
    protected Discount discount;

    public void addDiscount(Discount discount) {
        this.discount = discount;
    }

    public Booking(){
        this.itemList = new ArrayList<Item>();
    }

    public Booking(ArrayList<Item> itemList){
        this.itemList = itemList;
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public ArrayList<Item> getItemList(){
        return this.itemList;
    }

    public double bookingSum() {
        double sum = 0;
        for(Item i: itemList){
            sum += i.getPrice();
        }
        return sum;
    }
}

class WesternBooking extends Booking {
    private static final double TIP_PERCENT = 0.15;
    @Override
    public double bookingSum() {
        double sum = super.bookingSum();
        double d = (discount == null) ? 0 : discount.calDiscountAmount(sum);
        return sum * (1 + TIP_PERCENT) - d;
    }
}

class OtherBooking extends Booking {
    private static final double TIP_PERCENT = 0.1;

    @Override
    public double bookingSum() {
        double sum = super.bookingSum();
        double d = (discount == null) ? 0 : discount.calDiscountAmount(sum);
        return sum * (1 + TIP_PERCENT * Math.random()) - d;
    }
}

class Discount {
    String code;

    public Discount(String code) {
        this.code = code;
    }

    public double calDiscountAmount(double sum) {
        return 0;
    }
}

class VoucherDiscount extends Discount {
    public double amount;
    public VoucherDiscount(String code, double amount){
        super(code);
        this.amount = amount;
    }

    @Override
    public double calDiscountAmount(double sum) {
        if(amount > sum) {
            return sum;
        }
        return amount;
    }
}

class SpecialEventDiscount extends Discount {
    public int value;

    public SpecialEventDiscount(String code, int value) {
        super(code);
        this.value = value;
    }

    @Override
    public double calDiscountAmount(double sum) {
        double percentOfAmount = sum * value / 100;

        double max = Math.max(value, percentOfAmount);

        if(max > sum) {
            return sum;
        } return max;
    }
}

class PercentOffDiscount extends Discount {
    public int percent;
    
    public PercentOffDiscount(String code, int percent) {
        super(code);
        this.percent = percent;
    }

    @Override
    public double calDiscountAmount(double sum) {
        return sum * percent / 100;
    }
}