package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class ReadAndWriteToFile {
    public static void main(String[] args) {
        String csvFile = "src/input.csv";
        String txtFile = "src/output.txt";
        try(FileReader fr = new FileReader(csvFile);
            FileWriter fw = new FileWriter(txtFile)
        ) {
            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                    .setSkipHeaderRecord(true)
                    .build();
            Iterable<CSVRecord> records = csvFormat.parse(fr);
            for (CSVRecord record : records) {
             String value = String.format("insert into id s,parent id s, course name s \n",record.get(0),record.get(1),record.get(2));
             fw.write(value);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
