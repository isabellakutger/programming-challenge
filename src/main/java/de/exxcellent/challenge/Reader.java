package de.exxcellent.challenge;

import java.util.List;

public interface Reader {

    List<DataPoint> read(String fileName, int indexMax, int indexMin);
}
