import java.util.Scanner;

import static java.lang.Math.cos;
class TaylorSeries1 {
    static void cal_cos(float num) {
        float accuracy = (float) 0.0001, x1, denominator, cosx, cosval;
        num = num * (float) (3.142 / 180.0);
        x1 = 1;
        cosx = x1;
        cosval = (float) cos(num);
        int i = 1;
        do {
            denominator = 2 * i * (2 * i - 1);
            x1 = -x1 * num * num / denominator;
            cosx = cosx + x1;
            i = i + 1;
        }
        while (accuracy <= cosval - cosx);
        System.out.println(cosx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        float num = sc.nextFloat();
        cal_cos(num);
    }
}

