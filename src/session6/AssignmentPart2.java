package session6;

import java.util.Scanner;

public class AssignmentPart2 {
	
	private static Scanner sc;

	public static void main(String[] args) {		
		int[] prime_arr=new int[10];
		//Using for loop adding prime numbers to the array as entered by the user
        for(int i=0;i<prime_arr.length;i++){
        	sc = new Scanner(System.in);
        	System.out.println("Enter number");
            int number=sc.nextInt();
            int flag=0;
            for(int j=2;j<=number/2;j++){
            	if(number%j==0){
            		System.out.println("Number entered is not Prime Number. PLease Enter Another Number");
            		i=i-1;
            		flag=1;
            		break;
            		
            	}
            }
            if(flag==0){
            	System.out.println("The number is prime and added to array");
            	prime_arr[i]=number;
            }
            
        } 
        System.out.println(" Printing the elements of Array in the original Order");
        for(int i=0;i<10;i++){
        System.out.println(prime_arr[i]);
        }
        
        System.out.println(" Printing the elements of Array in the Reverse Order");        
        int prime_reverse[];
        prime_reverse = new int[prime_arr.length];
        for(int k=0,l=9;k<prime_arr.length;k++,l--){
        	prime_reverse[k] = prime_arr[l];
        	System.out.print(prime_reverse[k]+"\n");
        }
        
		
	}

}
