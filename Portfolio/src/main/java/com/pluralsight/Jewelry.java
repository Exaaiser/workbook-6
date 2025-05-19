package com.pluralsight;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat, double value) {
        super(name, value);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
