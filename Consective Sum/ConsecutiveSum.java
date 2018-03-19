

/**
 * Created by sivareddy.guduru on 14/3/18.
 */
public class ConsecutiveSum {

    static int consecutive(long n) {
        int count = 0;
        for (int i = 1; i * (i + 1) < 2 * n; i++) {
            float a = (float) ((1.0 * n - (i * (i + 1)) / 2) / (i + 1));
            if (a - (int) a == 0.0)
                count++;
        }
        return count;
    }

}
