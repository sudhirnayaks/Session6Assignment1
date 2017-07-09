package session6;

import java.util.Scanner;

public class AssignmentPart4 {

	private static Scanner sc;

	public static void main(String[] args) {
		//Initializing Month Array
		String[] months = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		//Initializing Day Array
		int[] daysinMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		int no_of_days = 0;
		
		sc = new Scanner(System.in);
		System.out.println("Enter the date in DD/MMM/YYYY format. Example 26/Apr/2017");
		String date_entered = sc.nextLine();
		String date[] = date_entered.split("/");
		
		for(int i = 0; i<months.length;i++){
			if(months[i].equals(date[1])){
				for(int j=0;j<i;j++){
					no_of_days = daysinMonth[j]+no_of_days;
				}
				int value = Integer.valueOf(date[0]);
				no_of_days = no_of_days + value;
			}
			
		}
		System.out.println("Number od days is "+no_of_days);

	}

}
