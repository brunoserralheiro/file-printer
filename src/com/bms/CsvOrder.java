package com.bms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CsvOrder {

    public static void main(String[] args) {
        String fileName= "src/resource/file.csv";
        File file= new File(fileName);
        List<Integer> ints= new ArrayList<>();

        // 2D String array
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values));
            }

            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // iterate 2D array
        for(List<String> line: lines) {
        	for (String value: line) {
            	ints.add(Integer.parseInt(value));
            }
        }
        Collections.sort(ints);
        System.out.println(ints);
    }

}