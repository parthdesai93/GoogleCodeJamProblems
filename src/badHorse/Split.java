/*
 * As the leader of the Evil League of Evil, Bad Horse has a lot of problems to deal with.
 *  Most recently, there have been far too many arguments and far too much backstabbing in 
 *  the League, so much so that Bad Horse has decided to split the league into two 
 *  departments in order to separate troublesome members. Being the Thoroughbred of Sin,
 *  Bad Horse isn't about to spend his valuable time figuring out how to split the League 
 *  members by himself. That what he's got you -- his loyal henchman -- for.
 */
package badHorse;

import java.util.Scanner;

public class Split {

	public static void main(String[] args){
		String line; 
		String del = " ";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input");
		line = in.nextLine();
		System.out.println("Enter another line");
		line = line + del + in.nextLine();
		System.out.println("line : " + line);
		String[] parts = line.split(" ");
		int i = parts.length;
		System.out.println(i);
		if(i%2 != 0){
			System.out.println("Cant be divided");
		}
		else
		{
			System.out.println("Can be divided");
		}
		
		in.close();
	}
}
