
public class ProfilingExamples {

    public static void main(String[] args) {
        System.out.println("Connect up the VisualVM");
        int inp = 1000;

        //For a delay of execution to have time to hook up the VisualVM profiler
        try {
            Thread.sleep(5000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Running constant function with input " + inp);
        constant(inp);

        System.out.println("Running linear function with input " + inp);
        linear(inp);

        System.out.println("Running quadratic function with input " + inp);
        quadratic(inp);

        System.out.println("Running cubic function with input " + inp);
        cubic(inp);

    }

    /**
     * Constant. O(1)
     *
     * @param n the n
     * @return the int
     */
    public static int constant(int n) {
        if (n > 1) {
            return n;
        } else {
            return 0;
        }
    }

    /**
     * Linear. O(n)
     *
     * @param n the n
     * @return the int
     */
    public static int linear(int n) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += j;

        }
        return sum;
    }

    /**
     * Quadratic. O(n^2)
     *
     * @param n the n
     * @return the int
     */
    public static int quadratic(int n) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                sum += j * k;
            }
        }
        return sum;
    }

    /**
     * Cubic. O(n^3)
     *
     * @param n the n
     * @return the int
     */
    public static int cubic(int n) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    sum += j * k / (l + 1);
                }
            }
        }
        return sum;
    }

}
