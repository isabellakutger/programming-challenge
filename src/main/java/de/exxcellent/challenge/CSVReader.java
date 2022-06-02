package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements Reader {

    @Override
    public List<DataPoint> read(String fileName, int indexMax, int indexMin) {
        List<DataPoint> dataPointList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            //skip first line
            bufferedReader.readLine();

            // read first line containing actual data of csv
            String csvEntry = bufferedReader.readLine();

            // go through each entry in csv til there is no next entry
            while (csvEntry!= null) {

                // split current entry on comma
               String[] entryArray = csvEntry.split(",");

               // convert entries in array to integer and create new data point object
               DataPoint dataPoint = new DataPoint(entryArray[0], Integer.parseInt(entryArray[indexMax]), Integer.parseInt(entryArray[indexMin]));

               dataPointList.add(dataPoint);

               // read next line of csv
               csvEntry = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataPointList;
    }
}
