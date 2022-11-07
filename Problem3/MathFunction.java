//Java Workout-2, Problem-3
package Problem3;

public class MathFunction {
    //Method to multiply two integers.
    static int multiply(int num1, int num2) {
        return num1*num2;
    }
    //Method to multiply two floats.
    static float multiply(float num1, float num2) {
        return num1*num2;
    }
    //Method to multiply one float and one integer.
    static float multiply(float num1, int num2) {
        return num1*num2;
    }
    //main method.
    public static void main(String a[]) {
       System.out.println(multiply(5.0f,6));
       System.out.println(multiply(10,6));
       System.out.println(multiply(5.0f,8.0f));
    }
}
