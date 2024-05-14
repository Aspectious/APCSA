package com.aspectious.Alculator;

import java.util.*;

public class meth {
	private static List<String> parseInputToNumberList(String input) {
		List<String> numbers = new ArrayList<String>();
		numbers = new ArrayList<String>(Arrays.asList(input.split("[^0-9]")));
		return numbers;
		
	}
	private static List<String> parseInputToOperands(String input) {
		List<String> operands = new ArrayList<String>();
		operands = new ArrayList<String>(Arrays.asList(input.replaceAll("[0-9]","").split("")));
		return operands;
		
	}
	
	
	public static boolean checkIfCalculable(String input) {
		List<String> numbers = parseInputToNumberList(input);
		List<String> operands = parseInputToOperands(input);
		
		if (numbers.size() != operands.size() +1) {
			return false;
		} else {
			return true;
		}
	}
	public static double calculate(String input) {
		
		List<String> numbers = parseInputToNumberList(input);
		List<String> operands = parseInputToOperands(input);
		
		
		// PEMDAS
		
		// Hunt for PEMD from left to right ( For four function, only M and D)
		for (int i=0; i<operands.size(); i++) {
			String item = operands.get(i);
			if (item.equals("*")||item.equals("/")) {
				if (item.equals("*")) {
					numbers.set(i, ""+(Double.parseDouble(numbers.get(i)) * Double.parseDouble(numbers.get(i+1))));
					numbers.remove(i+1);
					operands.remove(i);
				} else {
					numbers.set(i, ""+(Double.parseDouble(numbers.get(i)) / Double.parseDouble(numbers.get(i+1))));
					numbers.remove(i+1);
					operands.remove(i);
				}
				i--;
			}
		}
		// Do Addition / Subraction
		for (int i=0; i<operands.size(); i++) {
			String item = operands.get(i);
			if (item.equals("+")||item.equals("-")) {
				if (item.equals("+")) {
					numbers.set(i, ""+(Double.parseDouble(numbers.get(i)) + Double.parseDouble(numbers.get(i+1))));
					numbers.remove(i+1);
					operands.remove(i);
				} else {
					numbers.set(i, ""+(Double.parseDouble(numbers.get(i)) - Double.parseDouble(numbers.get(i+1))));
					numbers.remove(i+1);
					operands.remove(i);
				}
				i--;
			}
		}
		
		
		System.out.println(numbers);
		System.out.println(operands);
		return Double.parseDouble(numbers.get(0));
	}
}
