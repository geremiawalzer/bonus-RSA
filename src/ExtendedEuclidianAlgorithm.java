public class ExtendedEuclidianAlgorithm {
    
    public static void extendedEuclid(int a, int b, int[] d, int[] x, int[] y) {
        if (b == 0) {
            d[0] = a;
            x[0] = 1;
            y[0] = 0;
        } else {
            int[] x0 = new int[1];
            int[] y0 = new int[1];
            extendedEuclid(b,a % b, d, x0, y0);
            x[0] = y0[0];
            y[0] = x0[0] - a / b * y0[0];
        }
    }


    // int a = 1;
    // int b = 1;

    // int x0 = 1;
    // int y0 = 0;
    // int x1 = 0;
    // int y1 = 1;

    // int q = a/b;
    // int r = a%b;
    // String s = "Hallo";



    // do {
    //     a = b;
    //     b = r;
        
    //     x1 = x0 - (x1 * q);
    //     y1 = y0 - (y1 * q);
    //     x0 = x1;
    //     y0 = y1;
    //     q = 
    // } while (b!=0);
 
}
