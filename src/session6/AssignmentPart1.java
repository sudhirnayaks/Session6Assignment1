package session6;

public class AssignmentPart1 {	
	public static void main(String[] args) {
		//integer array with 10 elements
		int[] arrayElements = new int[10];
		
		//Printing all Even Number from Array
		System.out.println("Printing the even numbers from the array");
		for (int i=1; i<10; i++){
			arrayElements[i] = i;
			//checking for Even Numbers
			if (arrayElements[i]%2 ==0){
				System.out.println(arrayElements[i]);
			}
		}

	}

}
