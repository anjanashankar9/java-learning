package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicLong {
    public static void main(String[] args) {
        // Create an atomic integer
        AtomicInteger atomicInteger = new AtomicInteger();

        // Creating an atomic integer with an initial value
        AtomicInteger atomicInteger123 = new AtomicInteger(123);

        // Getting the atomic integer value
        long theValue = atomicInteger123.get();

        //Setting the value
        atomicInteger123.set(234);

        //Compare and set
        int expectedValue = 123;
        int newValue = 234;
        atomicInteger123.compareAndSet(expectedValue, newValue);

        //Add and get

        System.out.println(atomicInteger123.getAndAdd(10));
        System.out.println(atomicInteger123.addAndGet(10));
    }
}
