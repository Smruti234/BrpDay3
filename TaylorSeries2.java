import java.util.Scanner;

import static java.lang.Math.sin;

class TaylorSeries2 {
    static void cal_sin(float num) {
        float accuracy = (float) 0.0001, denominator, sinx, sinval;
        num = num * (float) (3.142 / 180.0);
        float x1 = num;
        sinx = num;
        sinval = (float) sin(num);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * num * num / denominator;
            sinx = sinx + x1;
            i = i + 1;
        } while (accuracy <= sinval - sinx);
        System.out.println(sinx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the degree:");
        float num = sc.nextFloat();
        cal_sin(num);
    }
}
