
package com.csc;

public class Fuzzy implements Feeling {
    public String color;

    public Fuzzy(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String description() {
        return color;
    }
}
