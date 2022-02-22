package org.example.second;

public class CommissionСounter {

    public CommissionСounter() {
    }

    public double getCommission(double count) {
        int whole = (int) (count / 100);
        double remainder = count % 100;
        if (remainder > 0) {
            return (whole + 1) * 7;
        }
        return whole * 7;
    }
}
