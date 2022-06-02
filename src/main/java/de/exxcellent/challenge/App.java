package de.exxcellent.challenge;

import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
        Reader csvReader = new CSVReader();

        List<DataPoint> weatherDataPoints = csvReader.read("src/main/resources/de/exxcellent/challenge/weather.csv", 1, 2);
        List<DataPoint> footballDataPoints = csvReader.read("src/main/resources/de/exxcellent/challenge/football.csv", 5, 6);

        String dayWithSmallestTempSpread = calculateDataPointWithSmallestTempSpread(weatherDataPoints);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = calculateDataPointWithSmallestTempSpread(footballDataPoints); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }

    public static String calculateDataPointWithSmallestTempSpread(List<DataPoint> dataPointList) {
        String dataPointWithSmallestTempSpread = null;
        int smallestSpread = 100;

        for (DataPoint dataPoint : dataPointList) {
            // calculate spread of current entry
            int spread = Math.abs(dataPoint.getMaximum() - dataPoint.getMinimum());

            if (spread < smallestSpread) {
                smallestSpread = spread;
                dataPointWithSmallestTempSpread = dataPoint.getLabel();
            }
        }

        return dataPointWithSmallestTempSpread;
    }
}
