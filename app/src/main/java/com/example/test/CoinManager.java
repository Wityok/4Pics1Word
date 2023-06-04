package com.example.test;

public class CoinManager {

    private static int coinCount = 0;

    public static void addCoins(int count) {
        coinCount += count;
    }

    public static void setCoinCount(int coinCount) {
        CoinManager.coinCount = coinCount;
    }

    public static int getCoinCount() {
        return coinCount;
    }

}
