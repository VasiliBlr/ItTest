package org.example.second;

public class BankProvider {

    private final CommissionСounter commissionСounter = new CommissionСounter();

    public BankProvider() {
    }

    public double getAllOrder(double count) {
        return count + commissionСounter.getCommission(count);
    }
}
