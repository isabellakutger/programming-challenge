package de.exxcellent.challenge;

import java.util.List;

public interface Reader {

    List<WeatherData> read(String fileName);
}
