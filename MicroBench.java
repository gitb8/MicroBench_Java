import static java.lang.System.out;

// add imports for bench:


public class MicroBench {
    
    // set run repetitions:
    static final int RUNS = 65536;

    // add variables for bench:

    // static int a = 0;



    public static void main(String[] args) {
        long start;
        long end;
        float first;
        float second;
    
        // add local variables for bench:

        int a = 0;



        start = System.nanoTime();
        for (int run = 0; run < RUNS; run++) {
            // 1st run

            a++;
            // a += 1           // reverse test

            // bench functions
            func1();
            // func2();         // reverse test
        }
        end = System.nanoTime();
        first = (float)(end - start);

        // reset bench variables:

        a = 0;

        
        start = System.nanoTime();
        for (int run = 0; run < RUNS; run++) {
            // 2nd run

            a += 1;
            // a++;             // reverse test

            // bench function
            func2();
            // func1();         // reverse test
        }
        end = System.nanoTime();
        second = (float)(end - start);

        // print result nanoseconds
        // out.println("1st run: " + first / (float)RUNS + " ns");
        // out.println("2nd run: " + second / (float)RUNS + " ns");

        // print result microseconds
        out.println("1st run: " + first / (float)RUNS / 1000.0 + " µs");
        out.println("2nd run: " + second / (float)RUNS / 1000.0 + " µs");

        // print result milliseconds
        // out.println("1st run: " + first / (float)RUNS / 1.0e6 + " ms");
        // out.println("2nd run: " + second / (float)RUNS / 1.0e6 + " ms");

        // print result seconds
        // out.println("1st run: " + first / (float)RUNS / 1.0e9 + " s");
        // out.println("2nd run: " + second / (float)RUNS / 1.0e9 + " s");
    }
    

    // add functions for bench:

    public static void func1() {}       // demo function
    
    public static void func2() {}       // demo function
}
