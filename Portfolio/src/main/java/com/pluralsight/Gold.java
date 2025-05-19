package com.pluralsight;

public class Gold extends FixedAsset {
    private double gram;

    public Gold(String name, double value) {
        super(name, value);
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
