package com.bms;

import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

/**
 * 
 */

/**
 * @author bruno
 *
 */
public class FileReader {

	public FileReader() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Set<Integer> readFile(){
		
		List<Integer> result = new ArrayList<>();
		InputStream in = this.getClass().getResourceAsStream("/resource/file.csv");
		Set<Integer> numbers = new TreeSet<>();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
			
		String line;	
		while((line = br.readLine()) != null) {
			System.out.println("Line:" + line);
			
			int[] intArray;
//			numbers.add(Integer.parseInt(line.split(",")));
			String[] str = line.split(",");
//			result.add(X));
			System.out.println(numbers);
//			System.out.println(result);
		}
		
//		int[]intArray = result.stream().
			
		} catch (Exception e) {
			// TODO: handle exception
		}		
		return numbers;
		
	}

	public void printOutput(Set<Integer> result) {
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		fileReader.printOutput(fileReader.readFile());
		
	}
}
