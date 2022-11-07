//Java Workout-2, Problem-4

package Problem4;

import java.util.concurrent.ThreadLocalRandom;
//class Medicine
class Medicine {
    //display method of class Medicine
    void displayLabel() {
        System.out.println("Name: Cipla");
        System.out.println("Address: Ernakulam, kerala");
    }
}
//class Tablet
class Tablet extends Medicine {
    //display method of class Tablet
    void displayLabel() {
        System.out.println("Store in a cool dry place");
    }
}
//class Syrup
class Syrup extends Medicine {
    //display method of class Syrup
    void displayLabel() {
        System.out.println("Keep away from children");
    }
}
//class Ointment
class Ointment extends Medicine {
    //display method of class Ointment
    void displayLabel() {
        System.out.println("For external use only");
    }
}

public class TestMedicine {
    public static void main(String a[]) {
        //Random integer generation
        int randomValue = ThreadLocalRandom
                .current()
                .nextInt(1, 3 + 1);;

        //Checks polymorphic behavior of displayLabel according to the random value.
        if(randomValue == 1) {
            Medicine medicine = new Medicine();
            Tablet tablet = new Tablet();
            medicine.displayLabel();
            tablet.displayLabel();
        }
        else if(randomValue == 2) {
            Medicine medicine = new Medicine();
            Syrup syrup = new Syrup();
            medicine.displayLabel();
            syrup.displayLabel();
        }
        else if(randomValue == 3) {
            Medicine medicine = new Medicine();
            Ointment ointment = new Ointment();
            medicine.displayLabel();
            ointment.displayLabel();
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
