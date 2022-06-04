package de.exxcellent.challenge;

import de.exxcellent.challenge.datapoint.DataPoint;
import de.exxcellent.challenge.reader.Reader;
import de.exxcellent.challenge.reader.impl.CSVReader;

import java.util.List;

import static de.exxcellent.challenge.service.CalculationService.calculateDataPointWithSmallestSpread;

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
        // Reader used for parsing CSV files
        Reader csvReader = new CSVReader();

        // parsed list of weather data points of weather.csv
        List<DataPoint> weatherDataPoints = csvReader.read("src/main/resources/de/exxcellent/challenge/weather.csv", 1, 2);
        // parsed list of football data points of football.csv
        List<DataPoint> footballDataPoints = csvReader.read("src/main/resources/de/exxcellent/challenge/football.csv", 5, 6);

        String dayWithSmallestTempSpread = calculateDataPointWithSmallestSpread(weatherDataPoints);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = calculateDataPointWithSmallestSpread(footballDataPoints); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
