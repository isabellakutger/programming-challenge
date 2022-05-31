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

        List<WeatherData> weatherDataPoints = csvReader.read("src/main/resources/de/exxcellent/challenge/weather.csv");

        String dayWithSmallestTempSpread = calculateDayWithSmallestTempSpread(weatherDataPoints);     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }

    public static String calculateDayWithSmallestTempSpread(List<WeatherData> weatherDataPoints) {
        String dayWithSmallestTempSpread = null;
        int smallestTempSpread = 100;

        for (WeatherData weatherData : weatherDataPoints) {
            // calculate temperature spread of current weather entry
            int tempSpread = weatherData.getMaximumTemperature() - weatherData.getMinimumTemperature();

            if (tempSpread < smallestTempSpread) {
                smallestTempSpread = tempSpread;
                dayWithSmallestTempSpread = weatherData.getDay();
            }
        }

        return dayWithSmallestTempSpread;
    }

    public static String calculateTeamWithSmallestGoalSpread() {
        // todo: implement Challenge Task 2
        return "Still a todo";
    }
}
