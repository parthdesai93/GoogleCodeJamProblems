/*
 * Given a list of space separated words, reverse the order of the words. Each line of text 
 * contains L letters and W words. A line will only consist of letters and space characters
 * There will be exactly one space character between each pair of consecutive words.
 */

package reverseWords;

import java.util.Scanner;

public class ReverseWord {
 
	public static void main(String[] args){
		String line; 
		Scanner in = new Scanner(System.in);
		line = in.nextLine();
		String[] parts = line.split(" ");
	
		for(int i = 0; i <parts.length; i++){
			System.out.print(parts[parts.length-1-i] + " ");
		}
		
		in.close();
	}	
}
