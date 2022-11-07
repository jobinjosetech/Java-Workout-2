//Java Workout-2, Problem-7

package Problem7;

public class InstanceTracker {
    //variable to store live instance count.
    static int liveCounter = 0;
    //variable to store all instances created.
    static  int createdCounter = 0;
    //constructor to increment the counts.
    InstanceTracker() {
        createdCounter++;
        liveCounter++;
    }
    public static void main(String a[]) {
        //class instances creation.
        InstanceTracker t1 = new InstanceTracker();
        InstanceTracker t2 = new InstanceTracker();
        InstanceTracker t3 = new InstanceTracker();
        //set references to null.
        t2 = null;
        t1 = null;
        //call garbage collector.
        System.gc();
        Runtime.getRuntime().gc();
        //display Instances created, destroyed and live information.
        System.out.println(String.format("Instances created: %d", createdCounter));
        System.out.println(String.format("Instances live: %d", liveCounter));
        System.out.println(String.format("Instances destroyed: %d", (createdCounter-liveCounter)));
    }
    //method which is called by the gc.
    protected void finalize() throws Throwable
    {
        liveCounter--;
    }
}
