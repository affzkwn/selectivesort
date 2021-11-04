package com.assessment.selectivesort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SelectivesortApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int [15];
		System.out.println("Insert Start:");
		int strSort = scan.nextInt();
		System.out.println("Insert End:");
		int endSort = scan.nextInt();
		System.out.println("Insert Element:");

		//fill all the element in the arr[]
		for(int i = 0; i<15; i++) { 
			arr[i] = scan.nextInt();
		}
		System.out.println("");
		System.out.println("Before Sort:");
		//show all the element in the arr[] before sorting
		for(int i = 0; i<15; i++) { 
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		System.out.println("After Sort:");

		//set the starting point and end point of the selection sort
		for (int i = strSort-1; i < endSort ; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j; //finding the lowest element  
                }  
            } 
			//rename the array 
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
		for(int result:arr){
			System.out.print(result + " ");
		}
		scan.close();
	}

}
