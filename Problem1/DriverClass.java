//Java Workout-2, Problem-1

package Problem1;
import java.util.Scanner;

//Faculty Class
class Faculty {
    protected String facultyId;
    protected float salary;
}

//Full-time Faculty Class
class FullTimeFaculty extends Faculty {
    private float basic;
    private float allowance;

    FullTimeFaculty(String id) {
        super.facultyId = id;
    }

    //Method to get full-time faculty inputs.
    void getInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print(String.format("Enter the Basic Salary of %s: ", super.facultyId));
        basic = sc.nextFloat();
        System.out.print(String.format("Enter the Allowance of %s: ", super.facultyId));
        allowance = sc.nextFloat();
        super.salary = basic + allowance;
        System.out.println("");
    }

    //Method to display full-time faculty information.
    void displayData() {
        System.out.println("************************************");
        System.out.println(String.format("Faculty Id: %s", super.facultyId));
        System.out.println(String.format("Salary: %.2f", super.salary));
        System.out.println(String.format("Basic: %.2f", basic));
        System.out.println(String.format("Allowance: %.2f", allowance));
        System.out.println("");
    }
}

//Part-time Faculty Class
class PartTimeFaculty extends Faculty {
    private float hour;
    private float rate;

    PartTimeFaculty(String id) {
        super.facultyId = id;
    }

    //Method to get part-time faculty inputs.
    void getInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.print(String.format("Enter the Hours of %s: ", super.facultyId));
        hour = sc.nextFloat();
        System.out.print(String.format("Enter the Rate of %s: ", super.facultyId));
        rate = sc.nextFloat();
        super.salary = hour * rate;
        System.out.println("");
    }

    //Method to display part-time faculty information.
    void displayData() {
        System.out.println("************************************");
        System.out.println(String.format("Faculty Id: %s", super.facultyId));
        System.out.println(String.format("Salary: %.2f", super.salary));
        System.out.println(String.format("Hours: %.2f", hour));
        System.out.println(String.format("Rate: %.2f", rate));
        System.out.println("");
    }
}

//Driver Class
public class DriverClass {
    public static void main(String a[]) {
        //Full-time Faculty.
        FullTimeFaculty faculty1 = new FullTimeFaculty("2546");
        faculty1.getInputs();
        FullTimeFaculty faculty2 = new FullTimeFaculty("1452");
        faculty2.getInputs();

        //Part-time Faculty.
        PartTimeFaculty faculty3 = new PartTimeFaculty("3578");
        faculty3.getInputs();
        PartTimeFaculty faculty4 = new PartTimeFaculty("1956");
        faculty4.getInputs();

        //Displaying Information.
        faculty1.displayData();
        faculty2.displayData();
        faculty3.displayData();
        faculty4.displayData();
    }
}
