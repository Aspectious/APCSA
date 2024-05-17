package com.aspectious.Alculator;

import java.text.AttributedString;
import java.util.*;

public class meth {
	private static List<String> parseInputToNumberList(String input) {
		List<String> numbers = new ArrayList<String>();
		numbers = new ArrayList<String>(Arrays.asList(input.split("[^0-9._]")));
		
		for (int i=0; i<numbers.size(); i++) {
			numbers.set(i, numbers.get(i).replaceAll("_", "-"));
			if (numbers.get(i).equals("")) {
				numbers.remove(i);
				i--;
			}
		}
		return numbers;
		
	}
	private static List<String> parseInputToOperands(String input) {
		List<String> operands = new ArrayList<String>();
		operands = new ArrayList<String>(Arrays.asList(input.replaceAll("[0-9._]","").split("")));
		return operands;
		
	}
	
	
	public static boolean checkIfCalculable(String input) {
		List<String> numbers = parseInputToNumberList(input);
		List<String> operands = parseInputToOperands(input);
		for (int i=0; i<numbers.size(); i++) {
			if ((numbers.get(i).length() == 1) && ((String.valueOf(numbers.get(i).charAt(0)).equals("-")))) {
				return false;
			}
			for (int j=1;j<numbers.get(i).length();j++) {
				if ((String.valueOf(numbers.get(i).charAt(j)).equals("-"))) {
					return false;
				}
			}
		}
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
		return Double.parseDouble(numbers.get(0));
	}
}
