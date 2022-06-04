package de.exxcellent.challenge.datapoint;

/**
 * This object saves two values for calculating a spread and a label of an entry from a data file
 */
public class DataPoint {
    // label of data point
    private String label;

    // first value for calculating spread
    private int maximum;

    // second value for calculation spread
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
