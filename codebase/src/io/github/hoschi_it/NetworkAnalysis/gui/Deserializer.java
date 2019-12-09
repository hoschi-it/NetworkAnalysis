package io.github.hoschi_it.NetworkAnalysis.gui;

import java.io.FileReader;
import java.io.Reader;

public class Deserializer {

    public static void main(String[] args) {
        System.out.println("TEST");
        CSVParse("C:/Users/uidn4922/Desktop/test.csv");
    }
    public static void CSVParse(String csvfilepath) {
        String[] oneLine;
        Reader reader = new FileReader((csvfilepath));
        CSVReader csvReader = new CSVReader(reader, ';');

        int i = 0;
        while ((oneLine = csvReader.readNext()) != null) {
                System.out.println("Read line: " + i);
                for (String elem : oneLine) {
                    System.out.println("Elem: " + elem);
                }
        }
    }


}
