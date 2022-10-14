//выражение будет стремиться к нулю, т.к. если привести его к виду 1 + ((1! + 2! + ... + (n-1)!)/n!)
//можно заметить, что сумма после единицы будет уменьшаться с ростом n
package org.mikola;

public class Main {

    public static double funcUn(int n) {
        long[] helper = new long[n + 2];
        helper[0] = 1;
        for (int i = 1; i <= n; i++) {
            helper[i] = helper[i - 1] * i;
        }
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ((double) helper[i]) / helper[n];
        }
        if (n == 0) {
            return 1;
        }
        return sum;

    }

    public static void main(String[] args) {
    }
}