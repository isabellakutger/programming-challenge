package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.datapoint.DataPoint;

import java.util.List;

/**
 * Interface for a reader that can be implemented for CSV files, JSON files and so on.
 */
public interface Reader {

    /**
     * This method parses a file and returns a list of data points containing the entries of this file
     * @param fileName name/path of the file that should be read
     * @param indexMax index of the value that will be used as maximum in DataPoint
     * @param indexMin index of the value that will be used as minimum in DataPoint
     * @return List of DataPoints containing the entries of provided file
     */
    List<DataPoint> read(String fileName, int indexMax, int indexMin);
}
