//Java Workout-2, Problem-6

package Problem6;

//class Employee
public class Employee {
    String name;
    long empId;
    String result;
    int ass1, ass2, ass3;

    public Employee(String name, long empId, int ass1, int ass2, int ass3) {
        this.name = name;
        this.empId = empId;
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.ass3 = ass3;
        //checks whether to promote or demote.
        if(ass1>75 & ass2>75 & ass3>75) {
            result = "Promoted";
        }else {
            result = "Demoted";
        }
    }
    //get total score.
    void getTotal() {
        int total = ass1+ass2+ass3;
        System.out.println(String.format("Total Score: %d", total));
    }
    //get percentage.
    void getPercentage() {
        float percentage = (((float)(ass1+ass2+ass3)/300)*100);
        System.out.println(String.format("Percentage: %.1f", percentage));
    }

    public static void main(String a[]) {
        Employee emp = new Employee("Jobin", 51307, 76, 86, 89);
        System.out.println(String.format("Result of %s: %s", emp.name, emp.result));
        emp.getTotal();
        emp.getPercentage();
    }
}
