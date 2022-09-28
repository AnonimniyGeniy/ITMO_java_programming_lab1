
public class Lab1 {
    static long a[];
    static double x[];
    static double a1[][];
    public static void Print() {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.printf("%.2f; ", a1[i][j]);
                //System.out.println(a1[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static void Lab1() {

        a = new long[16];
        x = new double[17];
        a1 = new double[16][17];
        boolean debug = false;
        for (int i = 16; i > 0; i--) {
            a[16 - i] = i;
        }
        for (int i = 0; i < 17; i++) {
            x[i] = ((Math.random() * 9) - 3);
        }
        double pt1 = 0;
        double pt2 = 0;
        double pt3 = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 17; j++) {
                switch ((int) a[i]) {
                    case 13:
                        pt1 = Math.pow(3 / (Math.pow(0.5 / x[j], 3)), (Math.pow(4 / (x[j] - 1), 2))); //first part of expression
                        pt2 = Math.pow(Math.pow((1.0 / 3) / x[j], 2), ((1.0 - Math.pow(x[j] - 1, 3)) / 4)); //2nd part of expression
                        pt3 = (Math.pow(((Math.atan((x[j] + 1.5) / 9) + 1) / (Math.pow(Math.E, x[j]))), 3) + 1.0 / 3); //3rd part of expression
                        a1[i][j] = Math.pow(pt1, pt2 * pt3);
                        if (debug) {
                            System.out.printf("%.2f; ", a1[i][j]);
                        }
                        break;
                        /*
                        we should break in every case of switch to stop
                        switch check and prevent executing default case
                        */
                    case 1:
                    case 5:
                    case 9:
                    case 10:
                    case 11:
                    case 14:
                    case 15:
                    case 16:
                        pt1 = Math.pow(((1.0 / 4) / (Math.pow((3.0 / 4) / (1.0 / x[j]), 3) - 2 - 0.5)), Math.asin((x[j] + 1.5) / 9));
                        a1[i][j] = pt1;
                        if (debug) {
                            System.out.printf("%.2f; ", a1[i][j]);
                        }
                        break;
                    default:
                        pt1 = Math.pow(((Math.tan(x[j]) - 0.25) / Math.log(Math.abs(x[j]))), 2) / 2;
                        a1[i][j] = Math.tan(Math.pow(Math.sin(Math.cbrt(x[j])), pt1));
                        if (debug) {
                            System.out.printf("%.2f; ", a1[i][j]);
                        }

                        break;
                }
                if (debug) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Lab1();
        //lab1.Print();
        Print();
    }
}