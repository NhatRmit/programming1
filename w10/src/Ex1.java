package Week9;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        Item i1 = new Item("chicken", 100.1);
        Item i2 = new Item("soup", 9.9);

        Booking b = new WesternBooking();
// Booking b = new OtherBooking();

        b.addItem(i1);
        b.addItem(i2);
        //b.addDiscount(new VoucherDiscount("GREAT", 50.0));

        System.out.println(b.bookingSum());
    }
}

class Item {
    String name;
    double price;


    public Item(String n, double p){
        name = n;
        price = p;
    }

    public String toString(){
        return String.format("Book's name: %s - Price: %.2f", name, price);
    }
}

class Booking{
    public ArrayList<Item> itemList;

    public Booking() {
        this.itemList = new ArrayList<Item>();
    }

     public void addItem(Item item){
        itemList.add(item);
     }

     public double bookingSum() {
        double sum = 0;
        for (Item i : itemList)
            sum += i.price;
        return sum;
     }
}

class WesternBooking extends Booking {
    static final double TIP_PERCENT = 0.15;
    @Override
    public double bookingSum() {

        double sum = super.bookingSum();

        return sum * (1 + TIP_PERCENT);
    }
}

class OtherBooking extends Booking {
    static final double MAX_PERCENT = 0.1;

    @Override
    public double bookingSum() {
        double sum = super.bookingSum();
        return sum * (1 + Math.random() * MAX_PERCENT);
    }
}