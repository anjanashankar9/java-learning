package section3.exercise;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Anjana Shankar
 * @Created 2020-09-24
 */
public class ComplexCalculation {
    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) {
        BigInteger result;
        /*
            Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
            Where each calculation in (..) is calculated on a different thread
        */
        List<PowerCalculatingThread> threads = new ArrayList<>();
        threads.add(new PowerCalculatingThread(base1, power1));
        threads.add(new PowerCalculatingThread(base2, power2));

        for (Thread t : threads) {
            t.start();
        }

        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BigInteger b1 = threads.get(0).getResult();
        BigInteger b2 = threads.get(1).getResult();
        result = b1.add(b2);

        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            result = BigInteger.ONE;

            for(BigInteger i = BigInteger.ZERO;
                i.compareTo(power) !=0;
                i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
            }
        }

        public BigInteger getResult() { return result; }
    }
}
