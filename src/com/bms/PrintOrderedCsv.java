/**
 * 
 */
package com.bms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author bruno
 *
 */
public class PrintOrderedCsv {

	public PrintOrderedCsv(String filePath) {
		
				 parseCsv(filePath);
	}

	public PrintOrderedCsv() {

		parseCsv("src/resource/file.csv");
	}

	private void parseCsv(String filePath) {

		try {
			Scanner input = new Scanner(new File(filePath));
			
			List<String> lines = new ArrayList<>();
			List<String> parsedStringList = new ArrayList<>();
			List<Integer> parsedIntegerList = new ArrayList<>();
			
			while (input.hasNext()) {
				String line =input.next();
				String[] lineArray = line.split(",");
				for (int i = 0; i < lineArray.length; i++) {
					lines = Arrays.asList(lineArray);
				}
				parsedStringList.addAll(lines);
			}
			for(String value: parsedStringList) {
				parsedIntegerList.add(Integer.parseInt(value));
			}
			Collections.sort(parsedIntegerList);
			StringBuilder stringBuilder = new StringBuilder();
			for (Integer integer : parsedIntegerList) {
				stringBuilder.append(integer).append(",");
				
			}
			stringBuilder.delete(stringBuilder.lastIndexOf(","),stringBuilder.length());
			System.out.println(stringBuilder);
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args!= null && args.length > 0)
				new PrintOrderedCsv(args[0]);
				else 
					new PrintOrderedCsv()	;
	
	}

}
