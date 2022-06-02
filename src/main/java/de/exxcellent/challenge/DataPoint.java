package de.exxcellent.challenge;

public class DataPoint {
    private String label;
    private int maximum;
    private int minimum;

    public DataPoint(String label, int maximum, int minimum) {
        this.label = label;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
