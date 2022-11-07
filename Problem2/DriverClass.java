//Java Workout-2, Problem-2
package Problem2;

//One BHK Class.
class OneBHK {
    private double roomArea, hallArea, price;
    //Parameterized Constructor.
    OneBHK(double roomArea, double hallArea, double price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    //show method of OneBHK class.
    void show() {
        System.out.println(String.format("Room Area: %.2f", roomArea));
        System.out.println(String.format("Hall Area: %.2f", hallArea));
        System.out.println(String.format("Price: %.2f", price));
    }
}

//Two BHK Class.
class TwoBHK extends OneBHK{
    private double room2Area;
    //calculates the total price.
    static double totalAmount = 0;
    //Parameterized Constructor.
    TwoBHK(float roomArea, float hallArea, float room2Area, float price) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
        totalAmount += price;
    }
    //show method of TwoBHK class.
    void show() {
        //run the show method of OneBHK class.
        super.show();
        System.out.println(String.format("Room2 Area: %.2f", room2Area));
        System.out.println("**************************");
        System.out.println("");
    }
}

//Driver Class
public class DriverClass {
    public static void main(String a[]) {
        TwoBHK flat1 = new TwoBHK(300, 500, 400, 4000000);
        TwoBHK flat2 = new TwoBHK(200, 300, 200, 2500000);
        TwoBHK flat3 = new TwoBHK(500, 800, 400, 7500000);
        //Displaying all the data members of three TwoBHk flat.
        flat1.show();
        flat2.show();
        flat3.show();
        //Display the total amount for all the flat's.
        System.out.println(String.format("Total amount for all flats: %.2f", TwoBHK.totalAmount));
    }
}
