package session6;

import java.util.Scanner;

public class AssignmentPart3 {

	private static Scanner sc;

	public static void main(String[] args) {
		//Initializing Month Array
		String[] months = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		//Initializing Day Array
		int[] daysinMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		sc = new Scanner(System.in);
		System.out.println("Please Enter the month in MMM format, For Example: Jan or Feb");
		String month_entered = sc.nextLine();
		
		//Logic to print number of Days in month
		for(int i = 0; i<months.length; i++){
			if(months[i].equals(month_entered)){
				System.out.println(month_entered +" has "+daysinMonth[i]+" days");
				break;
			}
			else{
				continue;
			}
		}

	}

}
