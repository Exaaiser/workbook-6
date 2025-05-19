package com.pluralsight;

public abstract class FixedAsset implements Valuable {
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public double getValue() {
        return marketValue;
    }
}
