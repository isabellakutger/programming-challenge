package de.exxcellent.challenge.service;

import de.exxcellent.challenge.datapoint.DataPoint;

import java.util.List;

/**
 * This class provides methods to perform calculation on DataPoint objects
 */
public class CalculationService {

    /**
     * This method calculates the data point with the smallest spread between two values from a provided list of DataPoints.
     * @param dataPointList List of Data Points
     * @return data point with the smallest spread between two values
     */
    public static String calculateDataPointWithSmallestSpread(List<DataPoint> dataPointList) {
        // initial Values
        String dataPointWithSmallestSpread = null;
        int smallestSpread = Integer.MAX_VALUE;

        for (DataPoint dataPoint : dataPointList) {
            // calculate spread of current entry
            int spread = Math.abs(dataPoint.getMaximum() - dataPoint.getMinimum());

            // if current spread is smaller than previous smallest spread
            // than set spread as smallest and save label of current entry
            if (spread < smallestSpread) {
                smallestSpread = spread;
                dataPointWithSmallestSpread = dataPoint.getLabel();
            }
        }

        return dataPointWithSmallestSpread;
    }
}
