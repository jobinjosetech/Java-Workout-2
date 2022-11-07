//Java Workout-2, Problem-8

package Problem8;

//Method to store value for call by reference.
class Wrapper {
    int value;
    Wrapper(int value) {
        this.value = value;
    }
}

public class NumberSwapping {
    //Method to swap number using call by value.
    static void swapByValue(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Call by Value");
        System.out.println(String.format("num1 = %d and num2 = %d", num1, num2));
        System.out.println("");
    }
    //Method to swap number using call by Reference.
    static void swapByReference(Wrapper w1, Wrapper w2) {
        int temp = w1.value;
        w1.value = w2.value;
        w2.value = temp;
        System.out.println("Call by Reference");
        System.out.println(String.format("num1 = %d and num2 = %d", w1.value, w2.value));
        System.out.println("");
    }

    public static void main(String a[]) {
        //call by value.
        int num1 = 5, num2 = 89;
        swapByValue(num1, num2);
        //call by reference.
        Wrapper w1 = new Wrapper(5);
        Wrapper w2 = new Wrapper(89);
        swapByReference(w1, w2);
    }
}
