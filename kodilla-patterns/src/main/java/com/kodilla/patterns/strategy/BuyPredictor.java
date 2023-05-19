package com.kodilla.patterns.strategy;

public sealed interface BuyPredictor
        permits ConservativePredictor, AggressivePredictor, BalancedPredictor {

    String predictWhatToBuy();
}
