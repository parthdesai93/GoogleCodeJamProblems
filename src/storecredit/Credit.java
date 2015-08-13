package storecredit;

import java.util.ArrayList;
import java.util.Scanner;

public class Credit {
	
	
	
	public static void main(String args[]) {
		//int numberOfCases;
		int credit;
		int numberOfItems; 
		int temp;
		int sum;
		int case1 = 0;	 
		int case2 = 0;

		String items="";
		ArrayList<String> l = new ArrayList<String>();
		
		
		Scanner in = new Scanner(System.in);
		
			
		System.out.println("Enter the credit");
		credit = in.nextInt();
		System.out.println("Enter number of items");
		numberOfItems = in.nextInt();
		System.out.println("Add items");
		in.nextLine();
		items = in.nextLine();
		System.out.println(items);
		String[] parts = items.split(" ");
		
		for(int i=0; i<parts.length; i++){
			l.add(parts[i]);
			System.out.println(l.get(i));
		}
		
		sumloop:
		for(int i=0; i<l.size();i++){
			for(int j= i+1 ;j<l.size(); j++ ){
				sum = Integer.parseInt(l.get(i)) + Integer.parseInt(l.get(j));
				if(sum == credit){
					
					case1 = i;
					case2 = j;
					System.out.println("I :" + l.get(i) + "J :" + l.get(j));
					break sumloop;
				}
			}
		}
		case1 = case1+1;
		case2 = case2+1;
		
		System.out.println("Case 1 :" + case1 + " - Case 2 : " + case2);
		
		
		in.close();
	}

}