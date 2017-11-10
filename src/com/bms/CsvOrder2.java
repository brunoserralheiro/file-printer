package com.bms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CsvOrder2 {

	public static void main(String[] args) {
		String fileName = "src/resource/file.csv";
		File file = new File(fileName);
		List<String> lines = new ArrayList<>();
		List<String> parsedStringList = new ArrayList<>();
		List<Integer> parsedIntegerList = new ArrayList<>();
		Scanner inputStream;

		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String line = inputStream.next();
				String[] values = line.split(",");
				for (int i = 0; i < values.length; i++) {
					lines = Arrays.asList(values);
				}
				parsedStringList.addAll(lines);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (String value : parsedStringList) {
			parsedIntegerList.add(Integer.parseInt(value));
		}
		Collections.sort(parsedIntegerList);
		System.out.println(parsedIntegerList);
	}

}