// Java program to print all possible strings of length k
package com.info;
class PrintAllKLengthStrings {

	// Driver method to test below methods
	public static void main(String[] args) {			 
		System.out.println("First Test");
		String s="abcdefghijklmnopqrstuvwxyz";
		char set1[] =s.toCharArray();
		int k = 2;
		printAllKLength(set1, k);
			 
	} 

	static void printAllKLength(char set[], int k) {
		int n = set.length;	 
		printAllKLengthRec(set, "", n, k);
	}

	// The main recursive method to print all possible strings of length k
	static void printAllKLengthRec(char set[], String prefix, int n, int k) {
		
		// Base case: k is 0, print prefix
		if (k == 0) {
			System.out.println(prefix);
			return;
		}

		// One by one add all characters from set and recursively 
		// call for k equals to k-1
		for (int i = 0; i < n; ++i) {
			
			// Next character of input added
			if(set[i]!='y')
			{
			String newPrefix = prefix + set[i]; 
			
			// k is decreased, because we have added a new character
			printAllKLengthRec(set, newPrefix, n, k - 1); 
			}
		}
	}
}
