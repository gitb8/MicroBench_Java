
public class MicroBench {       // private class?, class?
    
    // set run repetitions
    static final int RUNS = 65536;

    public static void main(String[] args) {
        long start;
        long end;
        float first;
        float second;
    
        // bench setup

        int a = 0;

        // /bench setup

    start = System.nanoTime();
    for (int run = 0; run < RUNS; run++) {
        // 1st run

        a++;
        // a += 1           // reverse test

        // bench function
        // func1();         //fix
        // func2();         // reverse test

    }   // /1st run
    end = System.nanoTime();
    first = (float) (end - start);

    // reset bench setup

    a = 0;

    // /reset bench setup

    start = System.nanoTime();
    for (int run = 0; run < RUNS; run++) {
        // 2nd run

        a += 1;
        // a++;             // reverse test

        // bench function
        // func2();         //fix
        // func1();         // reverse test

    }   // /2nd run
    end = System.nanoTime();
    second = (float) (end - start);

    // print result nanoseconds
    // System.out.println("1st run: " + first / (float) RUNS + " ns");
    // System.out.println("2nd run: " + second / (float) RUNS + " ns");

    // print result microseconds
    System.out.println("1st run: " + first / (float) RUNS / 1000.0 + " µs");
    System.out.println("2nd run: " + second / (float) RUNS / 1000.0 + " µs");

    // print result milliseconds
    // System.out.println("1st run: " + first / (float) RUNS / 1.0e6 + " ms");
    // System.out.println("2nd run: " + second / (float) RUNS / 1.0e6 + " ms");

    // print result seconds
    // System.out.println("1st run: " + first / (float) RUNS / 1.0e9 + " s");
    // System.out.println("2nd run: " + second / (float) RUNS / 1.0e9 + " s");
    }

    void func1() {}     // demo function
    
    void func2() {}     // demo function
}
