package io.github.hoschi_it.NetworkAnalysis.gui;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Deserializer
{

    public static void main(String[] args)
    {
        List<Integer[]> data = csvRead();
        for (Integer[] list : data)
        {
            for (Integer value : list)
            {

                System.out.print(value + " ");
            }
            System.out.println("\n");
        }
    }

    public static List<Integer[]> csvRead()
    {
        String path = "C:/Users/uidn5336/Desktop/test.csv";
        return csvRead(path);
    }

    public static List<Integer[]> csvRead(String path)
    {
        String csvFile = path;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        List<Integer[]> ajd = new ArrayList<Integer[]>();
        try
        {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {

                if (!line.contains("#"))
                {
                    // use semicolon as separator
                    String[] values = line.split(cvsSplitBy);
                    Integer[] valuesInt = new Integer[values.length];
                    int i = 0;
                    for (String value : values)
                    {
                        valuesInt[i] = Integer.parseInt(value);
                        i++;
                    }
                    ajd.add(valuesInt);
                }


            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return ajd;
    }

}
