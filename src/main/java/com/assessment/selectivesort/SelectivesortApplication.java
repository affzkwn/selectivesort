package com.assessment.selectivesort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SelectivesortApplication {

	public static void selectivesort (int [ ] data, int first, int n) {
		//set the starting point and end point of the selection sort
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert Start:");
		first = scan.nextInt();
		System.out.println("Insert End:");
		n = scan.nextInt();

		System.out.println("");
		System.out.println("Before Sort:");
		//show all the element in the arr[] before sorting
		for(int i = 0; i<15; i++) { 
			System.out.print(data[i] + " ");
		}

		for (int i = first; i < n + 1 ; i++)  
        {  	
            int index = i;  
            for (int j = i + 1; j < data.length; j++){  
                if (data[j] < data[index]){  
                    index = j; //finding the lowest element  
                }  
            } 
			//rename the array 
            int smallerNumber = data[index];   
            data[index] = data[i];  
            data[i] = smallerNumber;  
        } 
		scan.close(); 
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x[] = new int [15];

		System.out.println("Insert Element:");

		//fill all the element in the arr[]
		for(int i = 0; i<15; i++) { 
			x[i] = scan.nextInt();
		}
		
		System.out.println("");

		selectivesort(x, 0, 0);

		System.out.println("");
		System.out.println("After Sort:");

		for(int result:x){
			System.out.print(result + " ");
		}
		scan.close();
	}

}
