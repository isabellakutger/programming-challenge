package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements Reader {

    @Override
    public List<WeatherData> read(String fileName) {
        List<WeatherData> weatherDataPoints = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            //skip first line
            bufferedReader.readLine();

            // read first line containing actual data of csv
            String weatherEntry = bufferedReader.readLine();

            // go through each entry in csv til there is no next entry
            while (weatherEntry != null) {

                // split current weather entry on comma
               String[] weather = weatherEntry.split(",");

               // convert entries in weather array to integer and create new weather data object
               WeatherData weatherData = new WeatherData(weather[0], Integer.parseInt(weather[1]), Integer.parseInt(weather[2]));

               weatherDataPoints.add(weatherData);

               // read next line of csv
               weatherEntry = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return weatherDataPoints;
    }
}
